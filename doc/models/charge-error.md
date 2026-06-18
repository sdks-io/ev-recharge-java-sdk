
# Charge Error

## Structure

`ChargeError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Session code e.g InternalError | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Session message | String getMessage() | setMessage(String message) |

## Example

```java
import com.shell.apitest.models.ChargeError;

ChargeError chargeError = new ChargeError.Builder()
    .code("code4")
    .message("message6")
    .build();
```

