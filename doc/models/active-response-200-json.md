
# Active Response 200 Json

## Structure

`ActiveResponse200Json`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | [`GetChargeSessionRetrieveResponse200JsonStatusEnum`](../../doc/models/get-charge-session-retrieve-response-200-json-status-enum.md) | Required | **Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7` | GetChargeSessionRetrieveResponse200JsonStatusEnum getStatus() | setStatus(GetChargeSessionRetrieveResponse200JsonStatusEnum status) |
| `Data` | [`List<DataActive>`](../../doc/models/data-active.md) | Optional | - | List<DataActive> getData() | setData(List<DataActive> data) |

## Example (as JSON)

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "id": "00001c2a-0000-0000-0000-000000000000",
      "userId": "userId0",
      "emaId": "emaId8",
      "evseId": "evseId2",
      "startedAt": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": "00001c2a-0000-0000-0000-000000000000",
      "userId": "userId0",
      "emaId": "emaId8",
      "evseId": "evseId2",
      "startedAt": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": "00001c2a-0000-0000-0000-000000000000",
      "userId": "userId0",
      "emaId": "emaId8",
      "evseId": "evseId2",
      "startedAt": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

