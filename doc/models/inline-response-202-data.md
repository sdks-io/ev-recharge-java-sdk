
# Inline Response 202 Data

## Structure

`InlineResponse202Data`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SessionId` | `String` | Required | Session Id for tracking.<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` | String getSessionId() | setSessionId(String sessionId) |

## Example (as JSON)

```json
{
  "SessionId": "c3e332f0-1bb2-4f50-a96b-e075bbb71e68"
}
```

