
# Inline Response 202

## Structure

`InlineResponse202`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | [`GetChargeSessionRetrieveResponse200JsonStatusEnum`](../../doc/models/get-charge-session-retrieve-response-200-json-status-enum.md) | Required | Indicates overall status of the request | GetChargeSessionRetrieveResponse200JsonStatusEnum getStatus() | setStatus(GetChargeSessionRetrieveResponse200JsonStatusEnum status) |
| `Data` | [`List<InlineResponse202Data>`](../../doc/models/inline-response-202-data.md) | Required | - | List<InlineResponse202Data> getData() | setData(List<InlineResponse202Data> data) |

## Example

```java
import com.shell.apitest.models.GetChargeSessionRetrieveResponse200JsonStatusEnum;
import com.shell.apitest.models.InlineResponse202;
import com.shell.apitest.models.InlineResponse202Data;
import java.util.Arrays;
import java.util.UUID;

InlineResponse202 inlineResponse202 = new InlineResponse202.Builder(
    UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"),
    GetChargeSessionRetrieveResponse200JsonStatusEnum.SUCCESS,
    Arrays.asList(
        new InlineResponse202Data.Builder()
            .sessionId("c3e332f0-1bb2-4f50-a96b-e075bbb71e68")
            .build()
    )
)
.build();
```

