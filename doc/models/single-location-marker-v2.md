
# Single Location Marker V2

A Marker is a place on the map that represent a single Location

## Structure

`SingleLocationMarkerV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`SingleLocationMarkerStatusEnum`](../../doc/models/single-location-marker-status-enum.md) | Optional | Minimum of all status values in the Marker, e.g. if at least one Evse in the Marker is available, the value will be available | SingleLocationMarkerStatusEnum getStatus() | setStatus(SingleLocationMarkerStatusEnum status) |
| `Coordinates` | [`Coordinates`](../../doc/models/coordinates.md) | Optional | Coordinates of the Shell Recharge Site Location | Coordinates getCoordinates() | setCoordinates(Coordinates coordinates) |
| `EvseCount` | `Double` | Optional | Total number of Evse units in Locations that this Marker represents | Double getEvseCount() | setEvseCount(Double evseCount) |
| `MaxPower` | `Double` | Optional | Maximum power in kW across all locations grouped in this marker (disregarding availability) | Double getMaxPower() | setMaxPower(Double maxPower) |
| `LocationCount` | `Double` | Optional | Number of Locations that this Marker represents in the given set of bounds | Double getLocationCount() | setLocationCount(Double locationCount) |
| `LocationUid` | `String` | Optional | Unique ID of the Location this Marker represents | String getLocationUid() | setLocationUid(String locationUid) |
| `AuthorizationMethods` | [`List<SingleLocationMarkerAuthorizationMethodsItemsEnum>`](../../doc/models/single-location-marker-authorization-methods-items-enum.md) | Optional | Methods that can be used to Authorize sessions on this EVSE | List<SingleLocationMarkerAuthorizationMethodsItemsEnum> getAuthorizationMethods() | setAuthorizationMethods(List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) |
| `OperatorName` | `String` | Optional | Operator of this Shell Recharge Location | String getOperatorName() | setOperatorName(String operatorName) |
| `MarkerType` | `String` | Required, Constant | Type of the Marker, in this case it will always be SingleLocation<br><br>**Value**: `"SingleLocation"` | String getMarkerType() | setMarkerType(String markerType) |

## Example (as JSON)

```json
{
  "status": "Available",
  "evseCount": 12.0,
  "locationCount": 6.0,
  "locationUid": "2057411",
  "operatorName": "TheNewMotion",
  "markerType": "SingleLocation",
  "coordinates": {
    "latitude": 39.14,
    "longitude": 36.94
  },
  "maxPower": 45.08
}
```

