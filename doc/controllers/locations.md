# Locations

APIs for Shell Recharge Locations

```java
LocationsController locationsController = client.getLocationsController();
```

## Class Name

`LocationsController`

## Methods

* [Get EV Locations](../../doc/controllers/locations.md#get-ev-locations)
* [Ev Locations by ID](../../doc/controllers/locations.md#ev-locations-by-id)
* [Nearby Locations](../../doc/controllers/locations.md#nearby-locations)
* [Locations Markers](../../doc/controllers/locations.md#locations-markers)


# Get EV Locations

This API provides the list of all Shell Recharge locations. The list includes all Shell Recharge network and all locations available through our roaming partners. The end point provides flexible search criteria in order to get the list of Shell Recharge Network. The end point provides the details such as the exact location/address of the site along with the up-to-date status information of all the charging units in the site.

Supported Search Options

* Based on status of the Charging units. Eg : Available or Occupied
* Based on available connector types.
* Based on minimum Power output (in kW) available
* Based on a specific charging unit ID (EVSE ID)

```java
CompletableFuture<Response> getEVLocationsAsync(
    final UUID requestId,
    final GetEVLocationsEvseStatusEnum evseStatus,
    final GetEVLocationsConnectorTypesEnum connectorTypes,
    final Double connectorMinPower,
    final GetEVLocationsAuthorizationMethodsEnum authorizationMethods,
    final Boolean withOperatorName,
    final String evseId,
    final String locationExternalId,
    final String evseExternalId,
    final Integer pageNumber,
    final Integer perPage,
    final String updatedSince,
    final List<String> country,
    final List<String> excludeCountry)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `evseStatus` | [`GetEVLocationsEvseStatusEnum`](../../doc/models/get-ev-locations-evse-status-enum.md) | Query, Optional | Filter by Locations that have the given status |
| `connectorTypes` | [`GetEVLocationsConnectorTypesEnum`](../../doc/models/get-ev-locations-connector-types-enum.md) | Query, Optional | Filter by Locations that have Connectors with the set of Connector Types |
| `connectorMinPower` | `Double` | Query, Optional | Filter by Locations that have a Connector with at least this power output (in kW) |
| `authorizationMethods` | [`GetEVLocationsAuthorizationMethodsEnum`](../../doc/models/get-ev-locations-authorization-methods-enum.md) | Query, Optional | Filter by Locations that support the given Authorization Methods |
| `withOperatorName` | `Boolean` | Query, Optional | Return operator name in marker response object |
| `evseId` | `String` | Query, Optional | optional Standard EVSE (Electric Vehicle Supply Equipment) Id identifier (ISO-IEC-15118) |
| `locationExternalId` | `String` | Query, Optional | Filter by Locations with the given externalId. (Unique Location externalID provided by Shell Recharge) |
| `evseExternalId` | `String` | Query, Optional | Filter by Locations that have an Evse with the given External Id. (Unique individual EVSE externalID provided by Shell Recharge) |
| `pageNumber` | `Integer` | Query, Optional | Restrict the response list by providing a specific set of page Number. Set perPage parameter also when page Number is used. |
| `perPage` | `Integer` | Query, Optional | Restrict the number of sites in response per page. |
| `updatedSince` | `String` | Query, Optional | ZonedDateTime as string |
| `country` | `List<String>` | Query, Optional | Filter by Locations that are at least in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |
| `excludeCountry` | `List<String>` | Query, Optional | Filter by Locations that are not in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |

## Response Type

[`Response`](../../doc/models/response.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
String evseId = "NL*TNM*E01000401*0";
List<String> country = Arrays.asList(
    "NED"
);

List<String> excludeCountry = Arrays.asList(
    "NED"
);

locationsController.getEVLocationsAsync(requestId, null, null, null, null, null, evseId, null, null, null, null, null, country, excludeCountry).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`NotFoundException`](../../doc/models/not-found-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Ev Locations by ID

This API provides the details on a single Shell Recharge location.
The query for a single location is to be made using the Unique Internal identifier used to refer to this Location by Shell Recharge. (Uid from List of locations API)

```java
CompletableFuture<Response> evLocationsByIDAsync(
    final UUID requestId,
    final String id,
    final String providerId,
    final String since)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `id` | `String` | Template, Required | Unique Uid of the location from List of locations API |
| `providerId` | `String` | Query, Optional | The provider id that you wish to see locations and tariffs for |
| `since` | `String` | Query, Optional | to get the locations modified after a date |

## Response Type

[`Response`](../../doc/models/response.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
String id = "id0";

locationsController.evLocationsByIDAsync(requestId, id, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`NotFoundException`](../../doc/models/not-found-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Nearby Locations

This API provides the list of all nearby Shell Recharge locations based on the latitude and longitude provided in the request.
The list includes all Shell Recharge network and all sites available through our roaming partners.
The end point provides the details such as the exact location/address of the site along with the up-to-date status information of all the charging units in the site.

Supported Search Options

* Based on latitude and longitude of the location. (Mandatory)
* Based on status of the Charging units. Eg : Available or Occupied
* Based on available connector types.
* Based on minimum Power output (in kW) available

```java
CompletableFuture<Response> nearbyLocationsAsync(
    final UUID requestId,
    final double latitude,
    final double longitude,
    final Double limit,
    final String locationExternalId,
    final String evseId,
    final String evseExternalId,
    final String operatorName,
    final NearbyLocationsEvseStatusEnum evseStatus,
    final NearbyLocationsConnectorTypesEnum connectorTypes,
    final Double connectorMinPower,
    final NearbyLocationsAuthorizationMethodsEnum authorizationMethods,
    final Boolean withOperatorName,
    final Boolean withMaxPower,
    final List<String> country,
    final List<String> excludeCountry)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `latitude` | `double` | Query, Required | Latitude to get Shell Recharge Locations nearby |
| `longitude` | `double` | Query, Required | Longitude to get Shell Recharge Locations nearby |
| `limit` | `Double` | Query, Optional | Maximum number of Locations to retrieve |
| `locationExternalId` | `String` | Query, Optional | Filter by Locations with the given externalId Identifier as given by the Shell Recharge Operator, unique for that Operator |
| `evseId` | `String` | Query, Optional | Filter by Locations that have an Evse with the given Evse Id |
| `evseExternalId` | `String` | Query, Optional | Filter by Locations that have an Evse with the given External Id Identifier of the Evse as given by the Operator, unique for that Operator |
| `operatorName` | `String` | Query, Optional | Filter by Locations that have the given operator |
| `evseStatus` | [`NearbyLocationsEvseStatusEnum`](../../doc/models/nearby-locations-evse-status-enum.md) | Query, Optional | Filter by Locations that have the given status |
| `connectorTypes` | [`NearbyLocationsConnectorTypesEnum`](../../doc/models/nearby-locations-connector-types-enum.md) | Query, Optional | Filter by Locations that have Connectors with these Connector Types |
| `connectorMinPower` | `Double` | Query, Optional | Filter by Locations that have a Connector with at least this power output (in kW) |
| `authorizationMethods` | [`NearbyLocationsAuthorizationMethodsEnum`](../../doc/models/nearby-locations-authorization-methods-enum.md) | Query, Optional | Filter by Locations that support the given Authorization Methods |
| `withOperatorName` | `Boolean` | Query, Optional | Return operator name in marker object (only for marker type Single ChargePoint) |
| `withMaxPower` | `Boolean` | Query, Optional | Return maximum power in kW across all locations grouped in this marker (disregarding availability) |
| `country` | `List<String>` | Query, Optional | Filter by Locations that are at least in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |
| `excludeCountry` | `List<String>` | Query, Optional | Filter by Locations that are not in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |

## Response Type

[`Response`](../../doc/models/response.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
double latitude = 65.76D;
double longitude = 188.04D;
Double limit = 25D;
List<String> country = Arrays.asList(
    "NED"
);

List<String> excludeCountry = Arrays.asList(
    "NED"
);

locationsController.nearbyLocationsAsync(requestId, latitude, longitude, limit, null, null, null, null, null, null, null, null, null, null, country, excludeCountry).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`NotFoundException`](../../doc/models/not-found-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Locations Markers

This API, when given a set of bounds on the geographical front (East,West, North, South) will return a set of Markers that fall within the requested bounds. The API will automatically group locations at the same position on the map into one Marker.

The API also provide further search options to filter the result set.

* Based on status of the Charging units. Eg : Available or Occupied
* Based on available connector types.
* Based on minimum Power output (in kW) available

```java
CompletableFuture<SingleLocationMarkerResponse> locationsMarkersAsync(
    final UUID requestId,
    final double west,
    final double south,
    final double east,
    final double north,
    final String zoom,
    final LocationsMarkersEvseStatusEnum evseStatus,
    final LocationsMarkersConnectorTypesEnum connectorTypes,
    final Double connectorMinPower,
    final LocationsMarkersAuthorizationMethodsEnum authorizationMethods,
    final Boolean withOperatorName,
    final Boolean withMaxPower,
    final String locationExternalId,
    final String evseId,
    final String evseExternalId,
    final String operatorName,
    final List<String> country,
    final List<String> excludeCountry)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `west` | `double` | Query, Required | Longitude of the western bound to get the Shell Recharge Locations |
| `south` | `double` | Query, Required | Latitude of the southern bound to get the Shell Recharge Locations |
| `east` | `double` | Query, Required | Longitude of the eastern bound to get the Shell Recharge Locations |
| `north` | `double` | Query, Required | Latitude of the northern bound to get the Shell Recharge Locations |
| `zoom` | `String` | Query, Required | Zoom level to show ex: (1: World, 5: Landmass/continent, 10: City, 15: Streets, 20: Buildings) |
| `evseStatus` | [`LocationsMarkersEvseStatusEnum`](../../doc/models/locations-markers-evse-status-enum.md) | Query, Optional | Filter by Locations that have the given status |
| `connectorTypes` | [`LocationsMarkersConnectorTypesEnum`](../../doc/models/locations-markers-connector-types-enum.md) | Query, Optional | Filter by Locations that have Connectors with the set of Connector Types |
| `connectorMinPower` | `Double` | Query, Optional | Filter by Locations that have a Connector with at least this power output (in kW) |
| `authorizationMethods` | [`LocationsMarkersAuthorizationMethodsEnum`](../../doc/models/locations-markers-authorization-methods-enum.md) | Query, Optional | Filter by Locations that support the given Authorization Methods |
| `withOperatorName` | `Boolean` | Query, Optional | Return operator name in marker object (only for marker type SingleChargePoint) |
| `withMaxPower` | `Boolean` | Query, Optional | Return maximum power in kW across all locations grouped in this marker (disregarding availability) |
| `locationExternalId` | `String` | Query, Optional | Filter by Locations with the given externalId. (Unique Location externalID provided by Shell Recharge) |
| `evseId` | `String` | Query, Optional | Filter by Locations that have an Evse with the given Evse Id |
| `evseExternalId` | `String` | Query, Optional | Filter by Locations that have an Evse with the given External Id Identifier of the Evse as given by the Operator, unique for that Operator |
| `operatorName` | `String` | Query, Optional | Filter by Locations that have the given operator |
| `country` | `List<String>` | Query, Optional | Filter by Locations that are at least in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |
| `excludeCountry` | `List<String>` | Query, Optional | Filter by Locations that are not in one of the given countries (specified using ISO 3166-1 alpha-3 codes) |

## Response Type

[`SingleLocationMarkerResponse`](../../doc/models/single-location-marker-response.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
double west = 152.84D;
double south = 13.76D;
double east = 16.36D;
double north = 73.98D;
String zoom = "zoom0";
List<String> country = Arrays.asList(
    "NED"
);

List<String> excludeCountry = Arrays.asList(
    "NED"
);

locationsController.locationsMarkersAsync(requestId, west, south, east, north, zoom, null, null, null, null, null, null, null, null, null, null, country, excludeCountry).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`NotFoundException`](../../doc/models/not-found-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |

