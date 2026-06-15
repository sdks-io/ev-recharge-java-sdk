
# Tariff V2

Tariff metadata aligned with TariffV2 GraphQL schema

## Structure

`TariffV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TariffId` | `String` | Required | Unique identifier for the tariff | String getTariffId() | setTariffId(String tariffId) |
| `TariffType` | [`TariffTypeEnum`](../../doc/models/tariff-type-enum.md) | Required | Tariff type classification | TariffTypeEnum getTariffType() | setTariffType(TariffTypeEnum tariffType) |
| `PowerRange` | [`PowerRange`](../../doc/models/power-range.md) | Required | - | PowerRange getPowerRange() | setPowerRange(PowerRange powerRange) |
| `InternalId` | `String` | Required | Internal identifier used by the platform | String getInternalId() | setInternalId(String internalId) |
| `OperatorId` | `String` | Required | Unique identifier of the operator | String getOperatorId() | setOperatorId(String operatorId) |
| `ProviderId` | `String` | Required | Unique identifier of the provider | String getProviderId() | setProviderId(String providerId) |
| `Currency` | `String` | Required | ISO 4217 Currency Code | String getCurrency() | setCurrency(String currency) |
| `TariffAltText` | [`List<TariffAltText>`](../../doc/models/tariff-alt-text.md) | Required | - | List<TariffAltText> getTariffAltText() | setTariffAltText(List<TariffAltText> tariffAltText) |
| `MinPrice` | `double` | Required | - | double getMinPrice() | setMinPrice(double minPrice) |
| `MaxPrice` | `double` | Required | - | double getMaxPrice() | setMaxPrice(double maxPrice) |
| `Elements` | [`List<TariffElement>`](../../doc/models/tariff-element.md) | Required | - | List<TariffElement> getElements() | setElements(List<TariffElement> elements) |
| `StartDateTime` | `LocalDateTime` | Required | - | LocalDateTime getStartDateTime() | setStartDateTime(LocalDateTime startDateTime) |
| `EndDateTime` | `LocalDateTime` | Required | - | LocalDateTime getEndDateTime() | setEndDateTime(LocalDateTime endDateTime) |
| `LastUpdated` | `LocalDateTime` | Required | - | LocalDateTime getLastUpdated() | setLastUpdated(LocalDateTime lastUpdated) |
| `CreatedBy` | `String` | Required | Identifier of the actor who created the tariff | String getCreatedBy() | setCreatedBy(String createdBy) |

## Example (as JSON)

```json
{
  "tariffId": "123e4567-e89b-12d3-a456-426614174000",
  "tariffType": "DRIVER",
  "powerRange": {
    "min": 0,
    "max": 100
  },
  "internalId": "123e4567-e89b-12d3-a456-426614174000",
  "operatorId": "AT-HTB",
  "providerId": "Shell_RP_2",
  "currency": "EUR",
  "tariffAltText": [
    {
      "language": "en",
      "text": "€0.30 per kWh"
    }
  ],
  "minPrice": 0.3,
  "maxPrice": 999.0,
  "elements": [
    {
      "priceComponents": [
        {
          "type": "FLAT",
          "stepSize": 1,
          "price": 0.3,
          "vat": 21.0
        }
      ],
      "restrictions": {
        "startTime": "startTime0",
        "endTime": "endTime2",
        "startDate": "2016-03-13",
        "endDate": "2016-03-13",
        "minKwh": 247.22
      }
    }
  ],
  "startDateTime": "10/06/2021 10:44:24",
  "endDateTime": "10/06/2021 10:44:24",
  "lastUpdated": "10/06/2021 10:44:24",
  "createdBy": "STAGE_API"
}
```

