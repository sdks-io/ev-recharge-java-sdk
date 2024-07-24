
# Serviceunavailable Exception

## Structure

`ServiceunavailableException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Errors` | [`List<ServiceunavailableErrMsg>`](../../doc/models/serviceunavailable-err-msg.md) | Optional | Exception details of the error | List<ServiceunavailableErrMsg> getErrors() | setErrors(List<ServiceunavailableErrMsg> errors) |

## Example (as JSON)

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "FAILED",
  "errors": [
    {
      "code": "code8",
      "message": "message0",
      "description": "description0",
      "details": [
        "details5",
        "details6"
      ]
    },
    {
      "code": "code8",
      "message": "message0",
      "description": "description0",
      "details": [
        "details5",
        "details6"
      ]
    }
  ]
}
```
