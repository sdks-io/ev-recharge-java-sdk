
# Unauthorized Exception

## Structure

`UnauthorizedException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | requestId or correlation id of the message | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<UnauthorizedErrMsg>`](../../doc/models/unauthorized-err-msg.md) | Optional | Exception details of the error | List<UnauthorizedErrMsg> getErrors() | setErrors(List<UnauthorizedErrMsg> errors) |

## Example

```java
try {
    // make the API call
} catch (UnauthorizedException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

