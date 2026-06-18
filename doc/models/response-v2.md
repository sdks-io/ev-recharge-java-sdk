
# Response V2

## Structure

`ResponseV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<LocationResponeObjectV2>`](../../doc/models/location-respone-object-v2.md) | Optional | API Response | List<LocationResponeObjectV2> getData() | setData(List<LocationResponeObjectV2> data) |

## Example

```java
import com.shell.apitest.models.Address;
import com.shell.apitest.models.Coordinates;
import com.shell.apitest.models.LocationResponeObjectV2;
import com.shell.apitest.models.ResponseV2;
import java.util.Arrays;
import java.util.UUID;

ResponseV2 responseV2 = new ResponseV2.Builder()
    .requestId(UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"))
    .status("SUCCESS")
    .data(Arrays.asList(
        new LocationResponeObjectV2.Builder()
            .uid("uid0")
            .externalId("externalId6")
            .coordinates(new Coordinates.Builder()
                .latitude(39.14D)
                .longitude(36.94D)
                .build())
            .operatorName("operatorName0")
            .address(new Address.Builder()
                .streetAndNumber("streetAndNumber2")
                .postalCode("postalCode8")
                .city("city6")
                .country("country0")
                .build())
            .build(),
        new LocationResponeObjectV2.Builder()
            .uid("uid0")
            .externalId("externalId6")
            .coordinates(new Coordinates.Builder()
                .latitude(39.14D)
                .longitude(36.94D)
                .build())
            .operatorName("operatorName0")
            .address(new Address.Builder()
                .streetAndNumber("streetAndNumber2")
                .postalCode("postalCode8")
                .city("city6")
                .country("country0")
                .build())
            .build(),
        new LocationResponeObjectV2.Builder()
            .uid("uid0")
            .externalId("externalId6")
            .coordinates(new Coordinates.Builder()
                .latitude(39.14D)
                .longitude(36.94D)
                .build())
            .operatorName("operatorName0")
            .address(new Address.Builder()
                .streetAndNumber("streetAndNumber2")
                .postalCode("postalCode8")
                .city("city6")
                .country("country0")
                .build())
            .build()
    ))
    .build();
```

