
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

## Example (as JSON)

```json
{
  "uid": "2",
  "externalId": "01000861_1_21",
  "connectorType": "Type2",
  "electricalProperties": {
    "powerType": "AC1Phase",
    "voltage": 110.62,
    "amperage": 46.4,
    "maxElectricPower": 232.04
  }
}
```

