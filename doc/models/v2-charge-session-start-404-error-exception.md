
# V2 Charge Session Start 404 Error Exception

## Structure

`V2ChargeSessionStart404ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<NotFoundErrMsg>`](../../doc/models/not-found-err-msg.md) | Optional | Exception details of the error | List<NotFoundErrMsg> getErrors() | setErrors(List<NotFoundErrMsg> errors) |

## Example

```java
try {
    // make the API call
} catch (V2ChargeSessionStart404ErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

