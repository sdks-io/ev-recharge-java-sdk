
# Data Retrieve

## Structure

`DataRetrieve`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Id of the session | UUID getId() | setId(UUID id) |
| `UserId` | `String` | Optional | Id of the user that started the session<br><br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` | String getUserId() | setUserId(String userId) |
| `EmaId` | `String` | Optional | Id of the evse that the user is charging<br><br>**Constraints**: *Minimum Length*: `12`, *Maximum Length*: `36` | String getEmaId() | setEmaId(String emaId) |
| `EvseId` | `String` | Optional | Ema-id of the charge token that is used | String getEvseId() | setEvseId(String evseId) |
| `LastUpdated` | `String` | Optional | Last updated date | String getLastUpdated() | setLastUpdated(String lastUpdated) |
| `StartedAt` | `LocalDateTime` | Optional | When the session is started | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `StoppedAt` | `LocalDateTime` | Optional | When the session is stopped | LocalDateTime getStoppedAt() | setStoppedAt(LocalDateTime stoppedAt) |
| `SessionState` | [`ChargeRetrieveState`](../../doc/models/charge-retrieve-state.md) | Optional | - | ChargeRetrieveState getSessionState() | setSessionState(ChargeRetrieveState sessionState) |

## Example

```java
import com.shell.apitest.DateTimeHelper;
import com.shell.apitest.models.DataRetrieve;
import java.util.UUID;

DataRetrieve dataRetrieve = new DataRetrieve.Builder()
    .id(UUID.fromString("78b5d7a3-bdba-43d7-9851-1c84fcddb782"))
    .userId("281482b6-2c9a-4fd1-b3ea-1928edb40ef9")
    .emaId("NL-TNM-C00122045-K")
    .evseId("NL*TNM*E02003451*0")
    .lastUpdated("lastUpdated8")
    .startedAt(DateTimeHelper.fromRfc8601DateTime("2015-08-19T11:20:27Z"))
    .stoppedAt(DateTimeHelper.fromRfc8601DateTime("2015-08-19T11:20:27Z"))
    .build();
```

