
# M400 Error Response Error 1 Exception

Bad Request

## Structure

`M400ErrorResponseError1Exception`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request.<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Required | Indicates overall status of the request<br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `6` | String getStatus() | setStatus(String status) |
| `Errors` | [`List<M400ErrorResponseError>`](../../doc/models/m400-error-response-error.md) | Optional | - | List<M400ErrorResponseError> getErrors() | setErrors(List<M400ErrorResponseError> errors) |

## Example (as JSON)

```json
{
  "RequestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "Status": "FAILED",
  "Errors": [
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key0": "AdditionalInfo0",
        "key1": "AdditionalInfo1",
        "key2": "AdditionalInfo2"
      }
    },
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key0": "AdditionalInfo0",
        "key1": "AdditionalInfo1",
        "key2": "AdditionalInfo2"
      }
    }
  ]
}
```

