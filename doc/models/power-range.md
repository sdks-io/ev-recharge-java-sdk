
# Power Range

## Structure

`PowerRange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Min` | `int` | Required | Minimum supported power in kW | int getMin() | setMin(int min) |
| `Max` | `int` | Required | Maximum supported power in kW | int getMax() | setMax(int max) |

## Example (as JSON)

```json
{
  "min": 0,
  "max": 100
}
```

