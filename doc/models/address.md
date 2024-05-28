
# Address

Address of the Shell Recharge Location

## Structure

`Address`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StreetAndNumber` | `String` | Optional | Street Name and Number of the Shell Recharge Location | String getStreetAndNumber() | setStreetAndNumber(String streetAndNumber) |
| `PostalCode` | `String` | Optional | Postal Code of the Shell Recharge Location | String getPostalCode() | setPostalCode(String postalCode) |
| `City` | `String` | Optional | City name of the Shell Recharge Location | String getCity() | setCity(String city) |
| `Country` | `String` | Optional | ISO 3166 Alpha-2 Country Code of the Shell Recharge Location | String getCountry() | setCountry(String country) |

## Example (as JSON)

```json
{
  "streetAndNumber": "Maarssenbroeksedijk 33",
  "postalCode": "3542 DM",
  "city": "Utrecht",
  "country": "NLD"
}
```

