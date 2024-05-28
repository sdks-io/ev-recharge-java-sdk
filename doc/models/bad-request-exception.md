
# Bad Request Exception

## Structure

`BadRequestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessageField() | setMessageField(String messageField) |

## Example (as JSON)

```json
{
  "code": "Bad Request",
  "message": "Request was not processed due to client error"
}
```

