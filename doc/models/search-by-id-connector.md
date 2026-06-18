
# Search by Id Connector

An EVSE can have one or many Connectors. Each Connector will normally have a different socket / cable and only one can be used to charge at a time.

## Structure

`SearchByIdConnector`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Internal identifier used to refer to this Connector | String getUid() | setUid(String uid) |
| `ExternalId` | `String` | Optional | Identifier of the Evse as given by the Operator, unique for the containing EVSE' | String getExternalId() | setExternalId(String externalId) |
| `ConnectorType` | [`ConnectorVOConnectorTypeEnum`](../../doc/models/connector-vo-connector-type-enum.md) | Optional | Type of the connector in the EVSE unit. | ConnectorVOConnectorTypeEnum getConnectorType() | setConnectorType(ConnectorVOConnectorTypeEnum connectorType) |
| `ElectricalProperties` | [`ElectricalPropertiesV2`](../../doc/models/electrical-properties-v2.md) | Optional | Electrical Properties of the Connector | ElectricalPropertiesV2 getElectricalProperties() | setElectricalProperties(ElectricalPropertiesV2 electricalProperties) |
| `Tariffs` | [`List<TariffV2>`](../../doc/models/tariff-v2.md) | Optional | Tariffs applicable to this Connector | List<TariffV2> getTariffs() | setTariffs(List<TariffV2> tariffs) |

## Example

```java
import com.shell.apitest.DateTimeHelper;
import com.shell.apitest.models.ConnectorVOConnectorTypeEnum;
import com.shell.apitest.models.ElectricalPropertiesPowerTypeEnum;
import com.shell.apitest.models.ElectricalPropertiesV2;
import com.shell.apitest.models.PowerRange;
import com.shell.apitest.models.PriceComponent;
import com.shell.apitest.models.Restrictions;
import com.shell.apitest.models.SearchByIdConnector;
import com.shell.apitest.models.TariffAltText;
import com.shell.apitest.models.TariffElement;
import com.shell.apitest.models.TariffTypeEnum;
import com.shell.apitest.models.TariffV2;
import com.shell.apitest.models.TypeEnum;
import java.util.Arrays;

SearchByIdConnector searchByIdConnector = new SearchByIdConnector.Builder()
    .uid("2")
    .externalId("01000861_1_21")
    .connectorType(ConnectorVOConnectorTypeEnum.TYPE2)
    .electricalProperties(new ElectricalPropertiesV2.Builder()
        .powerType(ElectricalPropertiesPowerTypeEnum.AC1PHASE)
        .voltage(110.62D)
        .amperage(46.4D)
        .maxElectricPower(232.04D)
        .build())
    .tariffs(Arrays.asList(
        new TariffV2.Builder(
            "tariffId4",
            TariffTypeEnum.DRIVER,
            new PowerRange.Builder(
                102,
                20
            )
            .build(),
            "internalId2",
            "operatorId8",
            "providerId2",
            "currency8",
            Arrays.asList(
                new TariffAltText.Builder(
                    "language8",
                    "text6"
                )
                .build()
            ),
            189.42D,
            247.64D,
            Arrays.asList(
                new TariffElement.Builder(
                    Arrays.asList(
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
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
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "createdBy4"
        )
        .build(),
        new TariffV2.Builder(
            "tariffId4",
            TariffTypeEnum.DRIVER,
            new PowerRange.Builder(
                102,
                20
            )
            .build(),
            "internalId2",
            "operatorId8",
            "providerId2",
            "currency8",
            Arrays.asList(
                new TariffAltText.Builder(
                    "language8",
                    "text6"
                )
                .build()
            ),
            189.42D,
            247.64D,
            Arrays.asList(
                new TariffElement.Builder(
                    Arrays.asList(
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
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
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "createdBy4"
        )
        .build(),
        new TariffV2.Builder(
            "tariffId4",
            TariffTypeEnum.DRIVER,
            new PowerRange.Builder(
                102,
                20
            )
            .build(),
            "internalId2",
            "operatorId8",
            "providerId2",
            "currency8",
            Arrays.asList(
                new TariffAltText.Builder(
                    "language8",
                    "text6"
                )
                .build()
            ),
            189.42D,
            247.64D,
            Arrays.asList(
                new TariffElement.Builder(
                    Arrays.asList(
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
                        )
                        .build(),
                        new PriceComponent.Builder(
                            TypeEnum.TIME,
                            124,
                            196.82D,
                            137.74D
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
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "createdBy4"
        )
        .build()
    ))
    .build();
```

