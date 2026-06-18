
# Inline Response 202 Data

## Structure

`InlineResponse202Data`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SessionId` | `String` | Optional | Session Id for tracking.<br><br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` | String getSessionId() | setSessionId(String sessionId) |

## Example

```java
import com.shell.apitest.models.InlineResponse202Data;

InlineResponse202Data inlineResponse202Data = new InlineResponse202Data.Builder()
    .sessionId("c3e332f0-1bb2-4f50-a96b-e075bbb71e68")
    .build();
```

