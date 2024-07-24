
# Charge Retrieve State

## Structure

`ChargeRetrieveState`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | Describes the session state<br><br>started, stopped, start-requested, stop-requested, failed-to-start, failed-to-stop | String getStatus() | setStatus(String status) |
| `Error` | [`ChargeError`](../../doc/models/charge-error.md) | Optional | - | ChargeError getError() | setError(ChargeError error) |

## Example (as JSON)

```json
{
  "status": "status6",
  "error": {
    "code": "code2",
    "message": "message4"
  }
}
```

