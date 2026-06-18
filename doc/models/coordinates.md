
# Coordinates

Coordinates of the Shell Recharge Site Location

## Structure

`Coordinates`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `Double` | Optional | Latitude of the Coordinate<br><br>**Constraints**: `>= -90`, `<= 90` | Double getLatitude() | setLatitude(Double latitude) |
| `Longitude` | `Double` | Optional | Longitude of the Coordinate<br><br>**Constraints**: `>= -180`, `<= 180` | Double getLongitude() | setLongitude(Double longitude) |

## Example

```java
import com.shell.apitest.models.Coordinates;

Coordinates coordinates = new Coordinates.Builder()
    .latitude(52.143814D)
    .longitude(52.143814D)
    .build();
```

