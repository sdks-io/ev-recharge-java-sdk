
# Multi Location Marker

A Marker is a place on the map that represent multiple Locations at the same spot

## Structure

`MultiLocationMarker`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MarkerType` | `String` | Required | Identifies the marker type. If it's a `MultiLocationMarker`, then the value is `MultiLocation` | String getMarkerType() | setMarkerType(String markerType) |
| `UniqueKey` | `String` | Optional | Uniquely identifies the marker object | String getUniqueKey() | setUniqueKey(String uniqueKey) |
| `Coordinates` | [`Coordinates`](../../doc/models/coordinates.md) | Optional | Coordinates of the Shell Recharge Site Location | Coordinates getCoordinates() | setCoordinates(Coordinates coordinates) |
| `LocationCount` | `Double` | Optional | Number of Locations that this Marker represents in the given set of bounds | Double getLocationCount() | setLocationCount(Double locationCount) |
| `EvseCount` | `Double` | Optional | Total number of Evses in Locations that this Marker represents | Double getEvseCount() | setEvseCount(Double evseCount) |
| `MaxPower` | `Double` | Optional | Maximum power in kW across all locations grouped in this marker (disregarding availability) | Double getMaxPower() | setMaxPower(Double maxPower) |
| `GeoHash` | `String` | Optional | GeoHash of marker coordinates | String getGeoHash() | setGeoHash(String geoHash) |

## Example (as JSON)

```json
{
  "markerType": "MultiLocation",
  "uniqueKey": "2060319_6",
  "locationCount": 6.0,
  "evseCount": 10.0,
  "maxPower": 42.0,
  "geoHash": "sx",
  "coordinates": {
    "latitude": 39.14,
    "longitude": 36.94
  }
}
```

