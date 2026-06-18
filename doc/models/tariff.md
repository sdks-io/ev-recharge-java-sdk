
# Tariff

## Structure

`Tariff`

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

## Example

```java
import com.shell.apitest.models.Tariff;
import com.shell.apitest.models.TariffVOUpdatedByEnum;

Tariff tariff = new Tariff.Builder()
    .startFee(0D)
    .perMinute(0.12D)
    .perKWh(0.89D)
    .currency("EUR")
    .updated("2021-07-06T10:44:24Z")
    .updatedBy(TariffVOUpdatedByEnum.TARIFFSERVICE)
    .structure("default")
    .build();
```

