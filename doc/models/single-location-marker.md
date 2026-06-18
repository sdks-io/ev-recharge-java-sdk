
# Single Location Marker

A Marker is a place on the map that represent a single Location

## Structure

`SingleLocationMarker`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MarkerType` | `String` | Required | Identifies the marker type. If it’s a `SingleLocationMarker`, then the value is `SingleLocation` | String getMarkerType() | setMarkerType(String markerType) |
| `UniqueKey` | `String` | Optional | Uniquely identifies the marker object | String getUniqueKey() | setUniqueKey(String uniqueKey) |
| `Status` | [`SingleLocationMarkerStatusEnum`](../../doc/models/single-location-marker-status-enum.md) | Optional | Minimum of all status values in the Marker, e.g. if at least one Evse in the Marker is available, the value will be available | SingleLocationMarkerStatusEnum getStatus() | setStatus(SingleLocationMarkerStatusEnum status) |
| `Coordinates` | [`Coordinates1`](../../doc/models/coordinates-1.md) | Optional | - | Coordinates1 getCoordinates() | setCoordinates(Coordinates1 coordinates) |
| `EvseCount` | `Double` | Optional | Total number of Evse units in Locations that this Marker represents | Double getEvseCount() | setEvseCount(Double evseCount) |
| `MaxPower` | `Double` | Optional | Maximum power in kW across all locations grouped in this marker (disregarding availability) | Double getMaxPower() | setMaxPower(Double maxPower) |
| `GeoHash` | `String` | Optional | GeoHash of marker coordinates | String getGeoHash() | setGeoHash(String geoHash) |
| `LocationUid` | `Double` | Optional | Unique ID of the Location this Marker represents | Double getLocationUid() | setLocationUid(Double locationUid) |
| `AuthorizationMethods` | [`List<SingleLocationMarkerAuthorizationMethodsItemsEnum>`](../../doc/models/single-location-marker-authorization-methods-items-enum.md) | Optional | Methods that can be used to Authorize sessions on this EVSE | List<SingleLocationMarkerAuthorizationMethodsItemsEnum> getAuthorizationMethods() | setAuthorizationMethods(List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) |
| `OperatorId` | `String` | Optional | Unique Id of the operator | String getOperatorId() | setOperatorId(String operatorId) |

## Example

```java
import com.shell.apitest.models.Coordinates1;
import com.shell.apitest.models.SingleLocationMarker;
import com.shell.apitest.models.SingleLocationMarkerStatusEnum;

SingleLocationMarker singleLocationMarker = new SingleLocationMarker.Builder(
    "SingleLocation"
)
.uniqueKey("2057411_1")
.status(SingleLocationMarkerStatusEnum.AVAILABLE)
.coordinates(new Coordinates1.Builder()
        .latitude(39.14D)
        .longitude(36.94D)
        .build())
.evseCount(12D)
.maxPower(42D)
.geoHash("sx")
.locationUid(2057411D)
.operatorId("AT-HTB")
.build();
```

