
# Evse V2

Each Location will contain one or more EVSEs (Electric Vehicle Supply Equipment). Each EVSE is capable of charging one car at a time.

## Structure

`EvseV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Internal identifier used to refer to single individual  EVSE unit. | String getUid() | setUid(String uid) |
| `ExternalId` | `String` | Optional | Identifier of the Evse as given by the Operator, unique for that Operator | String getExternalId() | setExternalId(String externalId) |
| `EvseId` | `String` | Optional | Standard EVSEId identifier (ISO-IEC-15118) | String getEvseId() | setEvseId(String evseId) |
| `Status` | [`EvseVOStatusEnum`](../../doc/models/evse-vo-status-enum.md) | Optional | The current status of the EVSE units availability | EvseVOStatusEnum getStatus() | setStatus(EvseVOStatusEnum status) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | String getUpdated() | setUpdated(String updated) |
| `PhysicalReference` | `String` | Optional | An optional number/string printed on the outside of the EVSE for visual identification | String getPhysicalReference() | setPhysicalReference(String physicalReference) |
| `Connectors` | [`List<ConnectorV2>`](../../doc/models/connector-v2.md) | Optional | List of all connectors available on this EVSE unit. | List<ConnectorV2> getConnectors() | setConnectors(List<ConnectorV2> connectors) |
| `AuthorizationMethods` | [`List<SingleLocationMarkerAuthorizationMethodsItemsEnum>`](../../doc/models/single-location-marker-authorization-methods-items-enum.md) | Optional | Methods that can be used to Authorize sessions on this EVSE | List<SingleLocationMarkerAuthorizationMethodsItemsEnum> getAuthorizationMethods() | setAuthorizationMethods(List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) |

## Example (as JSON)

```json
{
  "uid": "NL*MKS*E0000001*0_1",
  "externalId": "01001188_1",
  "evseId": "NL*TNM*E01000401*0",
  "status": "Available",
  "updated": "10/06/2021 10:44:24",
  "physicalReference": "Green",
  "authorizationMethods": [
    "NewMotionApp"
  ]
}
```

