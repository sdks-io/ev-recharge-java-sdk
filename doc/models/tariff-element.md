
# Tariff Element

## Structure

`TariffElement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PriceComponents` | [`List<PriceComponent>`](../../doc/models/price-component.md) | Required | - | List<PriceComponent> getPriceComponents() | setPriceComponents(List<PriceComponent> priceComponents) |
| `Restrictions` | [`Restrictions`](../../doc/models/restrictions.md) | Optional | - | Restrictions getRestrictions() | setRestrictions(Restrictions restrictions) |

## Example

```java
import com.shell.apitest.DateTimeHelper;
import com.shell.apitest.models.PriceComponent;
import com.shell.apitest.models.Restrictions;
import com.shell.apitest.models.TariffElement;
import com.shell.apitest.models.TypeEnum;
import java.util.Arrays;

TariffElement tariffElement = new TariffElement.Builder(
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
.build();
```

