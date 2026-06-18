
# Inline Response 2021

## Structure

`InlineResponse2021`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Required, Read-only | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | [`GetChargeSessionRetrieveResponse200JsonStatusEnum`](../../doc/models/get-charge-session-retrieve-response-200-json-status-enum.md) | Required, Read-only | **Constraints**: *Minimum Length*: `6`, *Maximum Length*: `7` | GetChargeSessionRetrieveResponse200JsonStatusEnum getStatus() | setStatus(GetChargeSessionRetrieveResponse200JsonStatusEnum status) |

## Example

```java
import com.shell.apitest.models.GetChargeSessionRetrieveResponse200JsonStatusEnum;
import com.shell.apitest.models.InlineResponse2021;
import java.util.UUID;

InlineResponse2021 inlineResponse2021 = new InlineResponse2021.Builder(
    UUID.fromString("9d2dee33-7803-485a-a2b1-2c7538e597ee"),
    GetChargeSessionRetrieveResponse200JsonStatusEnum.SUCCESS
)
.build();
```

