
# Single Location Marker Response V2

## Structure

`SingleLocationMarkerResponseV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<LocationMarkerV2>`](../../doc/models/containers/location-marker-v2.md) | Optional | - | List<LocationMarkerV2> getData() | setData(List<LocationMarkerV2> data) |

## Example

```java
import com.shell.apitest.models.Coordinates;
import com.shell.apitest.models.SingleLocationMarkerResponseV2;
import com.shell.apitest.models.SingleLocationMarkerStatusEnum;
import com.shell.apitest.models.SingleLocationMarkerV2;
import com.shell.apitest.models.containers.LocationMarkerV2;
import java.util.Arrays;
import java.util.UUID;

SingleLocationMarkerResponseV2 singleLocationMarkerResponseV2 = new SingleLocationMarkerResponseV2.Builder()
    .requestId(UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"))
    .status("SUCCESS")
    .data(Arrays.asList(
        LocationMarkerV2.fromSingleLocationMarkerV2(
            new SingleLocationMarkerV2.Builder(
                "SingleLocation"
            )
            .status(SingleLocationMarkerStatusEnum.UNAVAILABLE)
            .coordinates(new Coordinates.Builder()
                    .latitude(39.14D)
                    .longitude(36.94D)
                    .build())
            .evseCount(223.04D)
            .maxPower(45.08D)
            .locationCount(62.98D)
            .build()
        )
    ))
    .build();
```

