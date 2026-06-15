
# Single Location Marker Response V2

## Structure

`SingleLocationMarkerResponseV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `UUID` | Optional | requestId is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | UUID getRequestId() | setRequestId(UUID requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<LocationMarkerV2>`](../../doc/models/containers/location-marker-v2.md) | Optional | - | List<LocationMarkerV2> getData() | setData(List<LocationMarkerV2> data) |

## Example (as JSON)

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "markerType": "SingleLocation",
      "status": "Unavailable",
      "coordinates": {
        "latitude": 39.14,
        "longitude": 36.94
      },
      "evseCount": 223.04,
      "maxPower": 45.08,
      "locationCount": 62.98
    },
    {
      "markerType": "SingleLocation",
      "status": "Unavailable",
      "coordinates": {
        "latitude": 39.14,
        "longitude": 36.94
      },
      "evseCount": 223.04,
      "maxPower": 45.08,
      "locationCount": 62.98
    }
  ]
}
```

