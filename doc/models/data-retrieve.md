
# Data Retrieve

## Structure

`DataRetrieve`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Id of the session | UUID getId() | setId(UUID id) |
| `UserId` | `String` | Optional | Id of the user that started the session<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` | String getUserId() | setUserId(String userId) |
| `EmaId` | `String` | Optional | Id of the evse that the user is charging<br>**Constraints**: *Minimum Length*: `12`, *Maximum Length*: `36` | String getEmaId() | setEmaId(String emaId) |
| `EvseId` | `String` | Optional | Ema-id of the charge token that is used | String getEvseId() | setEvseId(String evseId) |
| `StartedAt` | `LocalDateTime` | Optional | When the session is started | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `StoppedAt` | `LocalDateTime` | Optional | When the session is stopped | LocalDateTime getStoppedAt() | setStoppedAt(LocalDateTime stoppedAt) |
| `SessionState` | [`DataRetrieveSessionStateEnum`](../../doc/models/data-retrieve-session-state-enum.md) | Optional | Describes the session state | DataRetrieveSessionStateEnum getSessionState() | setSessionState(DataRetrieveSessionStateEnum sessionState) |
| `SessionCode` | [`DataRetrieveSessionCodeEnum`](../../doc/models/data-retrieve-session-code-enum.md) | Optional | Session code e.g InternalError<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `14` | DataRetrieveSessionCodeEnum getSessionCode() | setSessionCode(DataRetrieveSessionCodeEnum sessionCode) |
| `SessionMessage` | `String` | Optional | Session message | String getSessionMessage() | setSessionMessage(String sessionMessage) |

## Example (as JSON)

```json
{
  "Id": "78b5d7a3-bdba-43d7-9851-1c84fcddb782",
  "UserId": "281482b6-2c9a-4fd1-b3ea-1928edb40ef9",
  "EmaId": "NL-TNM-C00122045-K",
  "EvseId": "NL*TNM*E02003451*0",
  "StartedAt": "08/19/2015 11:20:27",
  "StoppedAt": "08/19/2015 11:20:27",
  "SessionState": "stopped",
  "SessionCode": "InternalError",
  "SessionMessage": "Session stopped due to internal error"
}
```
