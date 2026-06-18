
# Single Location Marker Response

## Structure

`SingleLocationMarkerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<LocationMarker>`](../../doc/models/containers/location-marker.md) | Optional | - | List<LocationMarker> getData() | setData(List<LocationMarker> data) |

## Example

```java
import com.shell.apitest.models.Coordinates1;
import com.shell.apitest.models.SingleLocationMarker;
import com.shell.apitest.models.SingleLocationMarkerResponse;
import com.shell.apitest.models.SingleLocationMarkerStatusEnum;
import com.shell.apitest.models.containers.LocationMarker;
import java.util.Arrays;
import java.util.UUID;

SingleLocationMarkerResponse singleLocationMarkerResponse = new SingleLocationMarkerResponse.Builder()
    .requestId(UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"))
    .status("SUCCESS")
    .data(Arrays.asList(
        LocationMarker.fromSingleLocationMarker(
            new SingleLocationMarker.Builder(
                "SingleLocation"
            )
            .uniqueKey("uniqueKey2")
            .status(SingleLocationMarkerStatusEnum.AVAILABLE)
            .coordinates(new Coordinates1.Builder()
                    .latitude(39.14D)
                    .longitude(36.94D)
                    .build())
            .evseCount(26.34D)
            .maxPower(241.78D)
            .build()
        ),
        LocationMarker.fromSingleLocationMarker(
            new SingleLocationMarker.Builder(
                "SingleLocation"
            )
            .uniqueKey("uniqueKey2")
            .status(SingleLocationMarkerStatusEnum.AVAILABLE)
            .coordinates(new Coordinates1.Builder()
                    .latitude(39.14D)
                    .longitude(36.94D)
                    .build())
            .evseCount(26.34D)
            .maxPower(241.78D)
            .build()
        ),
        LocationMarker.fromSingleLocationMarker(
            new SingleLocationMarker.Builder(
                "SingleLocation"
            )
            .uniqueKey("uniqueKey2")
            .status(SingleLocationMarkerStatusEnum.AVAILABLE)
            .coordinates(new Coordinates1.Builder()
                    .latitude(39.14D)
                    .longitude(36.94D)
                    .build())
            .evseCount(26.34D)
            .maxPower(241.78D)
            .build()
        )
    ))
    .build();
```

