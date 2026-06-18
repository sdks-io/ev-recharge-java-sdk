
# Bad Request Exception

## Structure

`BadRequestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<BadRequestErrMsg>`](../../doc/models/bad-request-err-msg.md) | Optional | Exception details of the error | List<BadRequestErrMsg> getErrors() | setErrors(List<BadRequestErrMsg> errors) |

## Example

```java
try {
    // make the API call
} catch (BadRequestException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

