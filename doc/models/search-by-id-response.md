
# Search by Id Response

## Structure

`SearchByIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<SearchByIdLocationRespone>`](../../doc/models/search-by-id-location-respone.md) | Optional | API Response | List<SearchByIdLocationRespone> getData() | setData(List<SearchByIdLocationRespone> data) |

## Example (as JSON)

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "uid": "uid0",
      "externalId": "externalId6",
      "coordinates": {
        "latitude": 39.14,
        "longitude": 36.94
      },
      "operatorName": "operatorName0",
      "address": {
        "streetAndNumber": "streetAndNumber2",
        "postalCode": "postalCode8",
        "city": "city6",
        "country": "country0"
      }
    },
    {
      "uid": "uid0",
      "externalId": "externalId6",
      "coordinates": {
        "latitude": 39.14,
        "longitude": 36.94
      },
      "operatorName": "operatorName0",
      "address": {
        "streetAndNumber": "streetAndNumber2",
        "postalCode": "postalCode8",
        "city": "city6",
        "country": "country0"
      }
    },
    {
      "uid": "uid0",
      "externalId": "externalId6",
      "coordinates": {
        "latitude": 39.14,
        "longitude": 36.94
      },
      "operatorName": "operatorName0",
      "address": {
        "streetAndNumber": "streetAndNumber2",
        "postalCode": "postalCode8",
        "city": "city6",
        "country": "country0"
      }
    }
  ]
}
```

