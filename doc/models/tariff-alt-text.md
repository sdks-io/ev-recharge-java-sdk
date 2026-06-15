
# Tariff Alt Text

## Structure

`TariffAltText`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Language` | `String` | Required | ISO language code | String getLanguage() | setLanguage(String language) |
| `Text` | `String` | Required | Human readable tariff description | String getText() | setText(String text) |

## Example (as JSON)

```json
{
  "language": "en",
  "text": "€0.30 per kWh"
}
```

