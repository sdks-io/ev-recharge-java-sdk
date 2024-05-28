
# Chargesession Start Body

## Structure

`ChargesessionStartBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EvChargeNumber` | `String` | Required | The EV Charge Number which can be found on the back of the Shell EV Card<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getEvChargeNumber() | setEvChargeNumber(String evChargeNumber) |
| `EvseId` | `String` | Required | Standard EVSE (Electric Vehicle Supply Equipment) Id identifier (ISO-IEC-15118)<br>**Constraints**: *Minimum Length*: `18`, *Maximum Length*: `36` | String getEvseId() | setEvseId(String evseId) |

## Example (as JSON)

```json
{
  "EvChargeNumber": "NL-TNM-C00122045-K",
  "EvseId": "NL*TNM*E02003451*0"
}
```

