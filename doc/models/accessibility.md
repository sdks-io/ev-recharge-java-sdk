
# Accessibility

Accessibility of the Location

## Structure

`Accessibility`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AccessibilityStatusEnum`](../../doc/models/accessibility-status-enum.md) | Optional | Accessibility Status | AccessibilityStatusEnum getStatus() | setStatus(AccessibilityStatusEnum status) |
| `Remark` | `String` | Optional | optional Arbitrary text about restrictions of the Location | String getRemark() | setRemark(String remark) |

## Example (as JSON)

```json
{
  "status": "FreePublic",
  "remark": "optional comment"
}
```

