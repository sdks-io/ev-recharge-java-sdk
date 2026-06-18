
# Search by Id Location Respone

## Structure

`SearchByIdLocationRespone`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique Internal identifier used to refer to this Location by Shell Recharge | String getUid() | setUid(String uid) |
| `ExternalId` | `String` | Optional | Identifier as given by the Shell Recharge Operator, unique for that Operator | String getExternalId() | setExternalId(String externalId) |
| `Coordinates` | [`Coordinates`](../../doc/models/coordinates.md) | Optional | Coordinates of the Shell Recharge Site Location | Coordinates getCoordinates() | setCoordinates(Coordinates coordinates) |
| `OperatorName` | `String` | Optional | Operator of this Shell Recharge Location | String getOperatorName() | setOperatorName(String operatorName) |
| `Address` | [`Address`](../../doc/models/address.md) | Optional | Address of the Shell Recharge Location | Address getAddress() | setAddress(Address address) |
| `Accessibility` | [`AccessibilityV2`](../../doc/models/accessibility-v2.md) | Optional | Accessibility of the Location | AccessibilityV2 getAccessibility() | setAccessibility(AccessibilityV2 accessibility) |
| `Evses` | [`List<SearchByIdEvse>`](../../doc/models/search-by-id-evse.md) | Optional | - | List<SearchByIdEvse> getEvses() | setEvses(List<SearchByIdEvse> evses) |
| `OpeningHours` | [`List<OpeningHoursObject>`](../../doc/models/opening-hours-object.md) | Optional | Optional Opening Hours of the Location. Please note that it is not available for all sites. | List<OpeningHoursObject> getOpeningHours() | setOpeningHours(List<OpeningHoursObject> openingHours) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the location | String getUpdated() | setUpdated(String updated) |
| `LocationType` | `String` | Optional | the type of the location. Could be "UNKNOWN". | String getLocationType() | setLocationType(String locationType) |
| `OperatorId` | `String` | Optional | Unique Id of the operator | String getOperatorId() | setOperatorId(String operatorId) |
| `OpenTwentyFourSeven` | `Boolean` | Optional | Whether the location is open 24/7 | Boolean getOpenTwentyFourSeven() | setOpenTwentyFourSeven(Boolean openTwentyFourSeven) |

## Example

```java
import com.shell.apitest.models.Address;
import com.shell.apitest.models.Coordinates;
import com.shell.apitest.models.SearchByIdLocationRespone;

SearchByIdLocationRespone searchByIdLocationRespone = new SearchByIdLocationRespone.Builder()
    .uid("NL*MKS*E0000001*0")
    .externalId("01001188")
    .coordinates(new Coordinates.Builder()
        .latitude(39.14D)
        .longitude(36.94D)
        .build())
    .operatorName("TheNewMotion")
    .address(new Address.Builder()
        .streetAndNumber("streetAndNumber2")
        .postalCode("postalCode8")
        .city("city6")
        .country("country0")
        .build())
    .updated("2021-10-06T10:44:24Z")
    .locationType("Unknown")
    .operatorId("AT-HTB")
    .openTwentyFourSeven(true)
    .build();
```

