
# Active Response 200 Json

## Structure

`ActiveResponse200Json`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Required, Read-only | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | [`GetChargeSessionRetrieveResponse200JsonStatusEnum`](../../doc/models/get-charge-session-retrieve-response-200-json-status-enum.md) | Required, Read-only | **Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7` | GetChargeSessionRetrieveResponse200JsonStatusEnum getStatus() | setStatus(GetChargeSessionRetrieveResponse200JsonStatusEnum status) |
| `Data` | [`List<DataActive>`](../../doc/models/data-active.md) | Optional | - | List<DataActive> getData() | setData(List<DataActive> data) |

## Example

```java
import com.shell.apitest.DateTimeHelper;
import com.shell.apitest.models.ActiveResponse200Json;
import com.shell.apitest.models.DataActive;
import com.shell.apitest.models.GetChargeSessionRetrieveResponse200JsonStatusEnum;
import java.util.Arrays;
import java.util.UUID;

ActiveResponse200Json activeResponse200Json = new ActiveResponse200Json.Builder(
    UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"),
    GetChargeSessionRetrieveResponse200JsonStatusEnum.SUCCESS
)
.data(Arrays.asList(
        new DataActive.Builder()
            .id(UUID.fromString("00001c2a-0000-0000-0000-000000000000"))
            .userId("userId0")
            .emaId("emaId8")
            .evseId("evseId2")
            .startedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build(),
        new DataActive.Builder()
            .id(UUID.fromString("00001c2a-0000-0000-0000-000000000000"))
            .userId("userId0")
            .emaId("emaId8")
            .evseId("evseId2")
            .startedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build(),
        new DataActive.Builder()
            .id(UUID.fromString("00001c2a-0000-0000-0000-000000000000"))
            .userId("userId0")
            .emaId("emaId8")
            .evseId("evseId2")
            .startedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build()
    ))
.build();
```

