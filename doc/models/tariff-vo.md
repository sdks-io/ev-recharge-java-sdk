
# Tariff VO

Tariff details for charging on this Connector

## Structure

`TariffVO`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartFee` | `Double` | Optional | Tariff to start a charging session | Double getStartFee() | setStartFee(Double startFee) |
| `PerMinute` | `Double` | Optional | Tariff per minute of charging time | Double getPerMinute() | setPerMinute(Double perMinute) |
| `PerKWh` | `Double` | Optional | Tariff per kWh of energy consumed | Double getPerKWh() | setPerKWh(Double perKWh) |
| `Currency` | `String` | Optional | ISO 4217 Currency Code of the local currency. | String getCurrency() | setCurrency(String currency) |
| `Updated` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the Tariff | String getUpdated() | setUpdated(String updated) |
| `UpdatedBy` | [`TariffVOUpdatedByEnum`](../../doc/models/tariff-vo-updated-by-enum.md) | Optional | Source of the last update of the tariff details | TariffVOUpdatedByEnum getUpdatedBy() | setUpdatedBy(TariffVOUpdatedByEnum updatedBy) |
| `Structure` | `String` | Optional | Tariff structure that this tariff belongs to, typically Default unless specific tariff is defined for provider | String getStructure() | setStructure(String structure) |

## Example (as JSON)

```json
{
  "startFee": 0.0,
  "perMinute": 0.12,
  "perKWh": 0.89,
  "currency": "EUR",
  "updated": "07/06/2021 10:44:24",
  "updatedBy": "TariffService",
  "structure": "default"
}
```

