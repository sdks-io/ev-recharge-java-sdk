
# Unauthorized Exception

## Structure

`UnauthorizedException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessageField() | setMessageField(String messageField) |

## Example (as JSON)

```json
{
  "code": "InvalidToken",
  "message": "The access token is not valid"
}
```

