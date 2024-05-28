
# Location Respone Object

## Structure

`LocationResponeObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `Integer` | Optional | Unique Internal identifier used to refer to this Location by Shell Recharge | Integer getUid() | setUid(Integer uid) |
| `ExternalId` | `String` | Optional | Identifier as given by the Shell Recharge Operator, unique for that Operator | String getExternalId() | setExternalId(String externalId) |
| `Coordinates` | [`Coordinates`](../../doc/models/coordinates.md) | Optional | Coordinates of the Shell Recharge Site Location | Coordinates getCoordinates() | setCoordinates(Coordinates coordinates) |
| `OperatorName` | `String` | Optional | Operator of this Shell Recharge Location | String getOperatorName() | setOperatorName(String operatorName) |
| `Address` | [`Address`](../../doc/models/address.md) | Optional | Address of the Shell Recharge Location | Address getAddress() | setAddress(Address address) |
| `Accessibility` | [`Accessibility`](../../doc/models/accessibility.md) | Optional | Accessibility of the Location | Accessibility getAccessibility() | setAccessibility(Accessibility accessibility) |
| `Evses` | [`List<EvseVO>`](../../doc/models/evse-vo.md) | Optional | - | List<EvseVO> getEvses() | setEvses(List<EvseVO> evses) |
| `OpeningHours` | [`List<OpeningHoursObject>`](../../doc/models/opening-hours-object.md) | Optional | Optional Opening Hours of the Location. Please note that it is not available for all sites. | List<OpeningHoursObject> getOpeningHours() | setOpeningHours(List<OpeningHoursObject> openingHours) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the location | String getUpdated() | setUpdated(String updated) |
| `OperatorComment` | `String` | Optional | optional Operator-wide arbitrary text (eg promotional, warning) | String getOperatorComment() | setOperatorComment(String operatorComment) |
| `LocationType` | `String` | Optional | the type of the location. Could be "UNKNOWN". | String getLocationType() | setLocationType(String locationType) |

## Example (as JSON)

```json
{
  "uid": 12,
  "externalId": "01001188",
  "operatorName": "TheNewMotion",
  "updated": "10/06/2021 10:44:24",
  "operatorComment": "promotional",
  "locationType": "Unknown",
  "coordinates": {
    "latitude": 39.14,
    "longitude": 36.94
  },
  "address": {
    "streetAndNumber": "streetAndNumber2",
    "postalCode": "postalCode8",
    "city": "city6",
    "country": "country0"
  }
}
```

