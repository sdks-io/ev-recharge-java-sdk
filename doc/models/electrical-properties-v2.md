
# Electrical Properties V2

Electrical Properties of the Connector

## Structure

`ElectricalPropertiesV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PowerType` | [`ElectricalPropertiesPowerTypeEnum`](../../doc/models/electrical-properties-power-type-enum.md) | Optional | Power Type used in this connector. | ElectricalPropertiesPowerTypeEnum getPowerType() | setPowerType(ElectricalPropertiesPowerTypeEnum powerType) |
| `Voltage` | `Double` | Optional | Voltage in Volts for this connector | Double getVoltage() | setVoltage(Double voltage) |
| `Amperage` | `Double` | Optional | Electric Current in Amperes for this connector | Double getAmperage() | setAmperage(Double amperage) |
| `MaxElectricPower` | `Double` | Optional | Power in Kilowatts for this connector | Double getMaxElectricPower() | setMaxElectricPower(Double maxElectricPower) |

## Example

```java
import com.shell.apitest.models.ElectricalPropertiesPowerTypeEnum;
import com.shell.apitest.models.ElectricalPropertiesV2;

ElectricalPropertiesV2 electricalPropertiesV2 = new ElectricalPropertiesV2.Builder()
    .powerType(ElectricalPropertiesPowerTypeEnum.AC1PHASE)
    .voltage(230D)
    .amperage(16D)
    .maxElectricPower(3.7D)
    .build();
```

