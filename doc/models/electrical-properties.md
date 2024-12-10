
# Electrical Properties

Electrical Properties of the Connector

## Structure

`ElectricalProperties`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PowerType` | [`ElectricalPropertiesPowerTypeEnum`](../../doc/models/electrical-properties-power-type-enum.md) | Optional | - | ElectricalPropertiesPowerTypeEnum getPowerType() | setPowerType(ElectricalPropertiesPowerTypeEnum powerType) |
| `Voltage` | `Double` | Optional | Voltage in Volts for this connector | Double getVoltage() | setVoltage(Double voltage) |
| `Amperage` | `Double` | Optional | Electric Current in Amperes for this connector | Double getAmperage() | setAmperage(Double amperage) |
| `MaxElectricPower` | `Double` | Optional | Power in Kilowatts for this connector | Double getMaxElectricPower() | setMaxElectricPower(Double maxElectricPower) |

## Example (as JSON)

```json
{
  "voltage": 230.0,
  "amperage": 16.0,
  "maxElectricPower": 3.7,
  "powerType": "DC"
}
```

