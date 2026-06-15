
# Location Marker V2

## Class Name

`LocationMarkerV2`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`SingleLocationMarkerV2`](../../../doc/models/single-location-marker-v2.md) | LocationMarkerV2.fromSingleLocationMarkerV2(SingleLocationMarkerV2 singleLocationMarkerV2) |
| [`MultiLocationMarkerV2`](../../../doc/models/multi-location-marker-v2.md) | LocationMarkerV2.fromMultiLocationMarkerV2(MultiLocationMarkerV2 multiLocationMarkerV2) |

## SingleLocationMarkerV2

### Initialization Code

#### Example

```java
LocationMarkerV2.fromSingleLocationMarkerV2(
        new SingleLocationMarkerV2.Builder(
            "SingleLocation"
        )
        .status(SingleLocationMarkerStatusEnum.AVAILABLE)
        .evseCount(12D)
        .locationCount(6D)
        .locationUid("2057411")
        .operatorName("TheNewMotion")
        .build()
    )
```

## MultiLocationMarkerV2

### Initialization Code

#### Example

```java
LocationMarkerV2.fromMultiLocationMarkerV2(
        new MultiLocationMarkerV2.Builder(
            "MultiLocation"
        )
        .locationCount(6D)
        .evseCount(10D)
        .maxPower(42D)
        .operatorName("TheNewMotion")
        .build()
    )
```

