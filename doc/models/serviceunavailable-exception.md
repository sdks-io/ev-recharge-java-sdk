
# Serviceunavailable Exception

## Structure

`ServiceunavailableException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<ServiceunavailableErrMsg>`](../../doc/models/serviceunavailable-err-msg.md) | Optional | Exception details of the error | List<ServiceunavailableErrMsg> getErrors() | setErrors(List<ServiceunavailableErrMsg> errors) |

## Example

```java
try {
    // make the API call
} catch (ServiceunavailableException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

