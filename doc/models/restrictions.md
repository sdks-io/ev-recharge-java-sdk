
# Restrictions

## Structure

`Restrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartTime` | `String` | Optional | Valid from this time of the day (HH:mm) | String getStartTime() | setStartTime(String startTime) |
| `EndTime` | `String` | Optional | Valid until this time of the day (HH:mm) | String getEndTime() | setEndTime(String endTime) |
| `StartDate` | `LocalDate` | Optional | - | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Optional | - | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `MinKwh` | `Double` | Optional | - | Double getMinKwh() | setMinKwh(Double minKwh) |
| `MaxKwh` | `Double` | Optional | - | Double getMaxKwh() | setMaxKwh(Double maxKwh) |
| `MinCurrent` | `Double` | Optional | - | Double getMinCurrent() | setMinCurrent(Double minCurrent) |
| `MaxCurrent` | `Double` | Optional | - | Double getMaxCurrent() | setMaxCurrent(Double maxCurrent) |
| `MinPower` | `Double` | Optional | - | Double getMinPower() | setMinPower(Double minPower) |
| `MaxPower` | `Double` | Optional | - | Double getMaxPower() | setMaxPower(Double maxPower) |
| `MinDuration` | `Integer` | Optional | Minimum session duration in seconds | Integer getMinDuration() | setMinDuration(Integer minDuration) |
| `MaxDuration` | `Integer` | Optional | Maximum session duration in seconds | Integer getMaxDuration() | setMaxDuration(Integer maxDuration) |
| `DayOfWeek` | [`List<DayOfWeekEnum>`](../../doc/models/day-of-week-enum.md) | Optional | - | List<DayOfWeekEnum> getDayOfWeek() | setDayOfWeek(List<DayOfWeekEnum> dayOfWeek) |

## Example (as JSON)

```json
{
  "startTime": "08:00",
  "endTime": "18:00",
  "startDate": "2021-10-06",
  "endDate": "2021-10-31",
  "minKwh": 0.1,
  "maxKwh": 100,
  "minCurrent": 0,
  "maxCurrent": 500,
  "minPower": 0,
  "maxPower": 100,
  "minDuration": 0,
  "maxDuration": 86400
}
```

