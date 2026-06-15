
# Location Marker

## Class Name

`LocationMarker`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`SingleLocationMarker`](../../../doc/models/single-location-marker.md) | LocationMarker.fromSingleLocationMarker(SingleLocationMarker singleLocationMarker) |
| [`MultiLocationMarker`](../../../doc/models/multi-location-marker.md) | LocationMarker.fromMultiLocationMarker(MultiLocationMarker multiLocationMarker) |

## SingleLocationMarker

### Initialization Code

#### Example

```java
LocationMarker.fromSingleLocationMarker(
        new SingleLocationMarker.Builder(
            "SingleLocation"
        )
        .uniqueKey("2057411_1")
        .status(SingleLocationMarkerStatusEnum.AVAILABLE)
        .evseCount(12D)
        .maxPower(42D)
        .geoHash("sx")
        .locationUid(2057411D)
        .operatorId("AT-HTB")
        .build()
    )
```

## MultiLocationMarker

### Initialization Code

#### Example

```java
LocationMarker.fromMultiLocationMarker(
        new MultiLocationMarker.Builder(
            "MultiLocation"
        )
        .uniqueKey("2060319_6")
        .locationCount(6D)
        .evseCount(10D)
        .maxPower(42D)
        .geoHash("sx")
        .build()
    )
```

