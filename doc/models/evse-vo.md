
# Evse VO

Each Location will contain one or more EVSEs (Electric Vehicle Supply Equipment). Each EVSE is capable of charging one car at a time.

## Structure

`EvseVO`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `Integer` | Optional | Internal identifier used to refer to single individual  EVSE unit. | Integer getUid() | setUid(Integer uid) |
| `ExternalId` | `String` | Optional | Identifier of the Evse as given by the Operator, unique for that Operator | String getExternalId() | setExternalId(String externalId) |
| `EvseId` | `String` | Optional | Standard EVSEId identifier (ISO-IEC-15118) | String getEvseId() | setEvseId(String evseId) |
| `Status` | [`EvseVOStatusEnum`](../../doc/models/evse-vo-status-enum.md) | Optional | The current status of the EVSE units availability | EvseVOStatusEnum getStatus() | setStatus(EvseVOStatusEnum status) |
| `Connectors` | [`List<ConnectorVO>`](../../doc/models/connector-vo.md) | Optional | List of all connectors available on this EVSE unit. | List<ConnectorVO> getConnectors() | setConnectors(List<ConnectorVO> connectors) |
| `AuthorizationMethods` | [`EvseVOAuthorizationMethodsEnum`](../../doc/models/evse-vo-authorization-methods-enum.md) | Optional | Methods that can be used to Authorize sessions on this EVSE | EvseVOAuthorizationMethodsEnum getAuthorizationMethods() | setAuthorizationMethods(EvseVOAuthorizationMethodsEnum authorizationMethods) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | String getUpdated() | setUpdated(String updated) |
| `Deleted` | `String` | Optional | optional  ISO8601-compliant UTC deletion timestamp of the Evse | String getDeleted() | setDeleted(String deleted) |
| `PhysicalReference` | `String` | Optional | An optional number/string printed on the outside of the EVSE for visual identification | String getPhysicalReference() | setPhysicalReference(String physicalReference) |

## Example (as JSON)

```json
{
  "uid": 4,
  "externalId": "01001188_1",
  "evseId": "NL*TNM*E01000401*0",
  "updated": "10/06/2021 10:44:24",
  "deleted": "10/06/2021 10:44:24",
  "physicalReference": "Green",
  "status": "Available",
  "connectors": [
    {
      "uid": 60,
      "externalId": "externalId6",
      "connectorType": "Tesla",
      "electricalProperties": {
        "powerType": "AC1Phase",
        "voltage": 110.62,
        "amperage": 46.4,
        "maxElectricPower": 232.04
      },
      "fixedCable": false
    }
  ]
}
```

