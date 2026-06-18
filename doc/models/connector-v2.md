
# Connector V2

An EVSE can have one or many Connectors. Each Connector will normally have a different socket / cable and only one can be used to charge at a time.

## Structure

`ConnectorV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Internal identifier used to refer to this Connector | String getUid() | setUid(String uid) |
| `ExternalId` | `String` | Optional | Identifier of the Evse as given by the Operator, unique for the containing EVSE' | String getExternalId() | setExternalId(String externalId) |
| `ConnectorType` | [`ConnectorVOConnectorTypeEnum`](../../doc/models/connector-vo-connector-type-enum.md) | Optional | Type of the connector in the EVSE unit. | ConnectorVOConnectorTypeEnum getConnectorType() | setConnectorType(ConnectorVOConnectorTypeEnum connectorType) |
| `ElectricalProperties` | [`ElectricalPropertiesV2`](../../doc/models/electrical-properties-v2.md) | Optional | Electrical Properties of the Connector | ElectricalPropertiesV2 getElectricalProperties() | setElectricalProperties(ElectricalPropertiesV2 electricalProperties) |

## Example

```java
import com.shell.apitest.models.ConnectorV2;
import com.shell.apitest.models.ConnectorVOConnectorTypeEnum;
import com.shell.apitest.models.ElectricalPropertiesPowerTypeEnum;
import com.shell.apitest.models.ElectricalPropertiesV2;

ConnectorV2 connectorV2 = new ConnectorV2.Builder()
    .uid("2")
    .externalId("01000861_1_21")
    .connectorType(ConnectorVOConnectorTypeEnum.TYPE2)
    .electricalProperties(new ElectricalPropertiesV2.Builder()
        .powerType(ElectricalPropertiesPowerTypeEnum.AC1PHASE)
        .voltage(110.62D)
        .amperage(46.4D)
        .maxElectricPower(232.04D)
        .build())
    .build();
```

