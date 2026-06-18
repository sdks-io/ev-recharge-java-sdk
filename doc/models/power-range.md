
# Power Range

## Structure

`PowerRange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Min` | `int` | Required | Minimum supported power in kW | int getMin() | setMin(int min) |
| `Max` | `int` | Required | Maximum supported power in kW | int getMax() | setMax(int max) |

## Example

```java
import com.shell.apitest.models.PowerRange;

PowerRange powerRange = new PowerRange.Builder(
    0,
    100
)
.build();
```

