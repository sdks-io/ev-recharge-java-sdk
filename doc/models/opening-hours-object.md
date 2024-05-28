
# Opening Hours Object

## Structure

`OpeningHoursObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WeekDay` | [`OpeningHoursObjectWeekDayEnum`](../../doc/models/opening-hours-object-week-day-enum.md) | Optional | 3 letter day of the week | OpeningHoursObjectWeekDayEnum getWeekDay() | setWeekDay(OpeningHoursObjectWeekDayEnum weekDay) |
| `StartTime` | `String` | Optional | Hour in 24h local time when the location opens. | String getStartTime() | setStartTime(String startTime) |
| `EndTime` | `String` | Optional | Hour in 24h local time when the location closes. | String getEndTime() | setEndTime(String endTime) |

## Example (as JSON)

```json
{
  "weekDay": "Mon",
  "startTime": "08:00",
  "endTime": "23:00"
}
```

