
# M401 Error Response Error

## Structure

`M401ErrorResponseError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Error code that logically best represents the error encountered<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `5` | String getCode() | setCode(String code) |
| `Title` | `String` | Required | Description of the error type<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getTitle() | setTitle(String title) |
| `Detail` | `String` | Required | Details of the error that can help under the cause of the error<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `250` | String getDetail() | setDetail(String detail) |
| `AdditionalInfo` | `Map<String, String>` | Optional | - | Map<String, String> getAdditionalInfo() | setAdditionalInfo(Map<String, String> additionalInfo) |

## Example (as JSON)

```json
{
  "Code": "E0006",
  "Title": "Unauthorized",
  "Detail": "Supplied credentials are invalid or user does not have access to the operation",
  "AdditionalInfo": {
    "key0": "AdditionalInfo4",
    "key1": "AdditionalInfo5"
  }
}
```
