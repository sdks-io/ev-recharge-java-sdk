
# Multi Location Marker V2

A Marker is a place on the map that represent multiple Locations at the same spot

## Structure

`MultiLocationMarkerV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Coordinates` | [`Coordinates`](../../doc/models/coordinates.md) | Optional | Coordinates of the Shell Recharge Site Location | Coordinates getCoordinates() | setCoordinates(Coordinates coordinates) |
| `LocationCount` | `Double` | Optional | Number of Locations that this Marker represents in the given set of bounds | Double getLocationCount() | setLocationCount(Double locationCount) |
| `EvseCount` | `Double` | Optional | Total number of Evses in Locations that this Marker represents | Double getEvseCount() | setEvseCount(Double evseCount) |
| `MaxPower` | `Double` | Optional | Maximum power in kW across all locations grouped in this marker (disregarding availability) | Double getMaxPower() | setMaxPower(Double maxPower) |
| `OperatorName` | `String` | Optional | Operator of this Shell Recharge Location | String getOperatorName() | setOperatorName(String operatorName) |
| `MarkerType` | `String` | Required, Constant | Type of the Marker, in this case it will always be MultiLocation<br><br>**Value**: `"MultiLocation"` | String getMarkerType() | setMarkerType(String markerType) |

## Example (as JSON)

```json
{
  "locationCount": 6.0,
  "evseCount": 10.0,
  "maxPower": 42.0,
  "operatorName": "TheNewMotion",
  "markerType": "MultiLocation",
  "coordinates": {
    "latitude": 39.14,
    "longitude": 36.94
  }
}
```

