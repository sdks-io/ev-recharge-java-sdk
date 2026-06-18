
# Single Location Marker Status Enum

Minimum of all status values in the Marker, e.g. if at least one Evse in the Marker is available, the value will be available

## Enumeration

`SingleLocationMarkerStatusEnum`

## Fields

| Name |
|  --- |
| `AVAILABLE` |
| `OCCUPIED` |
| `UNAVAILABLE` |
| `UNKNOWN` |

## Example

```java
import com.shell.apitest.models.SingleLocationMarkerStatusEnum;

SingleLocationMarkerStatusEnum singleLocationMarkerStatus = SingleLocationMarkerStatusEnum.AVAILABLE;
```

