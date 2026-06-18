
# Multi Location Marker

A Marker is a place on the map that represent multiple Locations at the same spot

## Structure

`MultiLocationMarker`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MarkerType` | `String` | Required | Identifies the marker type. If it's a `MultiLocationMarker`, then the value is `MultiLocation` | String getMarkerType() | setMarkerType(String markerType) |
| `UniqueKey` | `String` | Optional | Uniquely identifies the marker object | String getUniqueKey() | setUniqueKey(String uniqueKey) |
| `Coordinates` | [`Coordinates1`](../../doc/models/coordinates-1.md) | Optional | - | Coordinates1 getCoordinates() | setCoordinates(Coordinates1 coordinates) |
| `LocationCount` | `Double` | Optional | Number of Locations that this Marker represents in the given set of bounds | Double getLocationCount() | setLocationCount(Double locationCount) |
| `EvseCount` | `Double` | Optional | Total number of Evses in Locations that this Marker represents | Double getEvseCount() | setEvseCount(Double evseCount) |
| `MaxPower` | `Double` | Optional | Maximum power in kW across all locations grouped in this marker (disregarding availability) | Double getMaxPower() | setMaxPower(Double maxPower) |
| `GeoHash` | `String` | Optional | GeoHash of marker coordinates | String getGeoHash() | setGeoHash(String geoHash) |

## Example

```java
import com.shell.apitest.models.Coordinates1;
import com.shell.apitest.models.MultiLocationMarker;

MultiLocationMarker multiLocationMarker = new MultiLocationMarker.Builder(
    "MultiLocation"
)
.uniqueKey("2060319_6")
.coordinates(new Coordinates1.Builder()
        .latitude(39.14D)
        .longitude(36.94D)
        .build())
.locationCount(6D)
.evseCount(10D)
.maxPower(42D)
.geoHash("sx")
.build();
```

