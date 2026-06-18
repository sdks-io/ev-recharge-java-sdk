
# Charge Retrieve State

## Structure

`ChargeRetrieveState`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | Describes the session state<br><br>started, stopped, start-requested, stop-requested, failed-to-start, failed-to-stop | String getStatus() | setStatus(String status) |
| `Error` | [`ChargeError`](../../doc/models/charge-error.md) | Optional | - | ChargeError getError() | setError(ChargeError error) |

## Example

```java
import com.shell.apitest.models.ChargeError;
import com.shell.apitest.models.ChargeRetrieveState;

ChargeRetrieveState chargeRetrieveState = new ChargeRetrieveState.Builder()
    .status("status0")
    .error(new ChargeError.Builder()
        .code("code2")
        .message("message4")
        .build())
    .build();
```

