
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

## Example

```java
import com.shell.apitest.DateTimeHelper;
import com.shell.apitest.models.PowerRange;
import com.shell.apitest.models.PriceComponent;
import com.shell.apitest.models.Restrictions;
import com.shell.apitest.models.TariffAltText;
import com.shell.apitest.models.TariffElement;
import com.shell.apitest.models.TariffTypeEnum;
import com.shell.apitest.models.TariffV2;
import com.shell.apitest.models.TypeEnum;
import java.util.Arrays;

TariffV2 tariffV2 = new TariffV2.Builder(
    "123e4567-e89b-12d3-a456-426614174000",
    TariffTypeEnum.REIMBURSEMENT,
    new PowerRange.Builder(
        0,
        100
    )
    .build(),
    "123e4567-e89b-12d3-a456-426614174000",
    "AT-HTB",
    "Shell_RP_2",
    "EUR",
    Arrays.asList(
        new TariffAltText.Builder(
            "en",
            "€0.30 per kWh"
        )
        .build()
    ),
    0.3D,
    999D,
    Arrays.asList(
        new TariffElement.Builder(
            Arrays.asList(
                new PriceComponent.Builder(
                    TypeEnum.FLAT,
                    1,
                    0.3D,
                    21D
                )
                .build()
            )
        )
        .restrictions(new Restrictions.Builder()
                .startTime("startTime0")
                .endTime("endTime2")
                .startDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
                .endDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
                .minKwh(247.22D)
                .build())
        .build()
    ),
    DateTimeHelper.fromRfc8601DateTime("2021-10-06T10:44:24Z"),
    DateTimeHelper.fromRfc8601DateTime("2021-10-06T10:44:24Z"),
    DateTimeHelper.fromRfc8601DateTime("2021-10-06T10:44:24Z"),
    "STAGE_API"
)
.build();
```

