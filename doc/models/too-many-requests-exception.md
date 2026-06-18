
# Too Many Requests Exception

## Structure

`TooManyRequestsException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | RequestID is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<RatelimitErrMsg>`](../../doc/models/ratelimit-err-msg.md) | Optional | Exception details of the error | List<RatelimitErrMsg> getErrors() | setErrors(List<RatelimitErrMsg> errors) |

## Example

```java
try {
    // make the API call
} catch (TooManyRequestsException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

