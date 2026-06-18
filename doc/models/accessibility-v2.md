
# Accessibility V2

Accessibility of the Location

## Structure

`AccessibilityV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AccessibilityStatusEnum`](../../doc/models/accessibility-status-enum.md) | Optional | Accessibility Status | AccessibilityStatusEnum getStatus() | setStatus(AccessibilityStatusEnum status) |

## Example

```java
import com.shell.apitest.models.AccessibilityStatusEnum;
import com.shell.apitest.models.AccessibilityV2;

AccessibilityV2 accessibilityV2 = new AccessibilityV2.Builder()
    .status(AccessibilityStatusEnum.FREEPUBLIC)
    .build();
```

