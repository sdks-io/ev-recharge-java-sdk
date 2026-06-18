
# Search by Id Evse

Each Location will contain one or more EVSEs (Electric Vehicle Supply Equipment). Each EVSE is capable of charging one car at a time.

## Structure

`SearchByIdEvse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Internal identifier used to refer to single individual  EVSE unit. | String getUid() | setUid(String uid) |
| `ExternalId` | `String` | Optional | Identifier of the Evse as given by the Operator, unique for that Operator | String getExternalId() | setExternalId(String externalId) |
| `EvseId` | `String` | Optional | Standard EVSEId identifier (ISO-IEC-15118) | String getEvseId() | setEvseId(String evseId) |
| `Status` | [`EvseVOStatusEnum`](../../doc/models/evse-vo-status-enum.md) | Optional | The current status of the EVSE units availability | EvseVOStatusEnum getStatus() | setStatus(EvseVOStatusEnum status) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | String getUpdated() | setUpdated(String updated) |
| `PhysicalReference` | `String` | Optional | An optional number/string printed on the outside of the EVSE for visual identification | String getPhysicalReference() | setPhysicalReference(String physicalReference) |
| `Connectors` | [`List<SearchByIdConnector>`](../../doc/models/search-by-id-connector.md) | Optional | List of all connectors available on this EVSE unit. | List<SearchByIdConnector> getConnectors() | setConnectors(List<SearchByIdConnector> connectors) |
| `AuthorizationMethods` | [`List<SingleLocationMarkerAuthorizationMethodsItemsEnum>`](../../doc/models/single-location-marker-authorization-methods-items-enum.md) | Optional | Methods that can be used to Authorize sessions on this EVSE | List<SingleLocationMarkerAuthorizationMethodsItemsEnum> getAuthorizationMethods() | setAuthorizationMethods(List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) |

## Example

```java
import com.shell.apitest.models.EvseVOStatusEnum;
import com.shell.apitest.models.SearchByIdEvse;
import com.shell.apitest.models.SingleLocationMarkerAuthorizationMethodsItemsEnum;
import java.util.Arrays;

SearchByIdEvse searchByIdEvse = new SearchByIdEvse.Builder()
    .uid("NL*MKS*E0000001*0_1")
    .externalId("01001188_1")
    .evseId("NL*TNM*E01000401*0")
    .status(EvseVOStatusEnum.AVAILABLE)
    .updated("2021-10-06T10:44:24Z")
    .physicalReference("Green")
    .authorizationMethods(Arrays.asList(
        SingleLocationMarkerAuthorizationMethodsItemsEnum.NEWMOTIONAPP
    ))
    .build();
```

