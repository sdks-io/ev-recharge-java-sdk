
# Chargesession Start Body

## Structure

`ChargesessionStartBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EvChargeNumber` | `String` | Required | Ev charge number<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getEvChargeNumber() | setEvChargeNumber(String evChargeNumber) |
| `EvseId` | `String` | Required | This is the Electric Vehicle EquipmentID<br><br>**Constraints**: *Minimum Length*: `18`, *Maximum Length*: `36` | String getEvseId() | setEvseId(String evseId) |

## Example

```java
import com.shell.apitest.models.ChargesessionStartBody;

ChargesessionStartBody chargesessionStartBody = new ChargesessionStartBody.Builder(
    "NL-TNM-C00122045-K",
    "NL*TNM*E02003451*0"
)
.build();
```

