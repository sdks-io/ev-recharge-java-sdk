# Charging

Charging Endpoints

```java
ChargingController chargingController = client.getChargingController();
```

## Class Name

`ChargingController`

## Methods

* [Start](../../doc/controllers/charging.md#start)
* [Stop](../../doc/controllers/charging.md#stop)
* [Get Charge Session Retrieve](../../doc/controllers/charging.md#get-charge-session-retrieve)
* [Active](../../doc/controllers/charging.md#active)


# Start

This endpoint start the charging session for the user.

```java
CompletableFuture<InlineResponse202> startAsync(
    final UUID requestId,
    final ChargesessionStartBody body)
```

## Authentication

This endpoint requires [BearerAuth](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `body` | [`ChargesessionStartBody`](../../doc/models/chargesession-start-body.md) | Body, Optional | - |

## Response Type

**200**: SUCCESS

[`InlineResponse202`](../../doc/models/inline-response-202.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
ChargesessionStartBody body = new ChargesessionStartBody.Builder(
    "NL-TNM-C00122045-K",
    "NL*TNM*E02003451*0"
)
.build();

chargingController.startAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof BadRequestException) {
        BadRequestException badRequestException = (BadRequestException) cause;
        badRequestException.printStackTrace();
    } else if (cause instanceof UnauthorizedException) {
        UnauthorizedException unauthorizedException = (UnauthorizedException) cause;
        unauthorizedException.printStackTrace();
    } else if (cause instanceof V2ChargeSessionStart404ErrorException) {
        V2ChargeSessionStart404ErrorException v2ChargeSessionStart404ErrorException = (V2ChargeSessionStart404ErrorException) cause;
        v2ChargeSessionStart404ErrorException.printStackTrace();
    } else if (cause instanceof TooManyRequestsException) {
        TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) cause;
        tooManyRequestsException.printStackTrace();
    } else if (cause instanceof InternalServerErrorException) {
        InternalServerErrorException internalServerErrorException = (InternalServerErrorException) cause;
        internalServerErrorException.printStackTrace();
    } else if (cause instanceof ServiceunavailableException) {
        ServiceunavailableException serviceunavailableException = (ServiceunavailableException) cause;
        serviceunavailableException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "sessionId": "c3e332f0-1bb2-4f50-a96b-e075bbb71e68"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`V2ChargeSessionStart404ErrorException`](../../doc/models/v2-charge-session-start-404-error-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Stop

Accepts a request to stop an active session when a valid session id is provided.

```java
CompletableFuture<InlineResponse2021> stopAsync(
    final UUID requestId,
    final String sessionId)
```

## Authentication

This endpoint requires [BearerAuth](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `sessionId` | `String` | Query, Required | Session Id<br><br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` |

## Response Type

**200**: SUCCESS

[`InlineResponse2021`](../../doc/models/inline-response-2021.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
String sessionId = "c3e332f0-1bb2-4f50-a96b-e075bbb71e68";

chargingController.stopAsync(requestId, sessionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof BadRequestException) {
        BadRequestException badRequestException = (BadRequestException) cause;
        badRequestException.printStackTrace();
    } else if (cause instanceof UnauthorizedException) {
        UnauthorizedException unauthorizedException = (UnauthorizedException) cause;
        unauthorizedException.printStackTrace();
    } else if (cause instanceof V2ChargeSessionStop404ErrorException) {
        V2ChargeSessionStop404ErrorException v2ChargeSessionStop404ErrorException = (V2ChargeSessionStop404ErrorException) cause;
        v2ChargeSessionStop404ErrorException.printStackTrace();
    } else if (cause instanceof TooManyRequestsException) {
        TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) cause;
        tooManyRequestsException.printStackTrace();
    } else if (cause instanceof InternalServerErrorException) {
        InternalServerErrorException internalServerErrorException = (InternalServerErrorException) cause;
        internalServerErrorException.printStackTrace();
    } else if (cause instanceof ServiceunavailableException) {
        ServiceunavailableException serviceunavailableException = (ServiceunavailableException) cause;
        serviceunavailableException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`V2ChargeSessionStop404ErrorException`](../../doc/models/v2-charge-session-stop-404-error-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Get Charge Session Retrieve

This endpoint returns the details of the session if the session is found.

```java
CompletableFuture<GetChargeSessionRetrieveResponse200Json> getChargeSessionRetrieveAsync(
    final UUID requestId,
    final String sessionId)
```

## Authentication

This endpoint requires [BearerAuth](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `sessionId` | `String` | Query, Required | Session Id<br><br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36`, *Pattern*: `^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$` |

## Response Type

**200**: Success

[`GetChargeSessionRetrieveResponse200Json`](../../doc/models/get-charge-session-retrieve-response-200-json.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
String sessionId = "c3e332f0-1bb2-4f50-a96b-e075bbb71e68";

chargingController.getChargeSessionRetrieveAsync(requestId, sessionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof BadRequestException) {
        BadRequestException badRequestException = (BadRequestException) cause;
        badRequestException.printStackTrace();
    } else if (cause instanceof UnauthorizedException) {
        UnauthorizedException unauthorizedException = (UnauthorizedException) cause;
        unauthorizedException.printStackTrace();
    } else if (cause instanceof V2ChargeSessionRetrieve404ErrorException) {
        V2ChargeSessionRetrieve404ErrorException v2ChargeSessionRetrieve404ErrorException = (V2ChargeSessionRetrieve404ErrorException) cause;
        v2ChargeSessionRetrieve404ErrorException.printStackTrace();
    } else if (cause instanceof TooManyRequestsException) {
        TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) cause;
        tooManyRequestsException.printStackTrace();
    } else if (cause instanceof InternalServerErrorException) {
        InternalServerErrorException internalServerErrorException = (InternalServerErrorException) cause;
        internalServerErrorException.printStackTrace();
    } else if (cause instanceof ServiceunavailableException) {
        ServiceunavailableException serviceunavailableException = (ServiceunavailableException) cause;
        serviceunavailableException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "id": "78b5d7a3-bdba-43d7-9851-1c84fcddb782",
      "userId": "281482b6-2c9a-4fd1-b3ea-1928edb40ef9",
      "emaId": "NL-TNM-C00122045-K",
      "evseId": "NL*TNM*E02003451*0",
      "lastUpdated": "2024-06-19T07:36:57.985998Z",
      "startedAt": "2024-06-19T11:20:27Z",
      "stoppedAt": "2014-06-19T12:20:27Z",
      "sessionState": {
        "status": "Started"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`BadRequestException`](../../doc/models/bad-request-exception.md) |
| 401 | The request has not been applied because it lacks valid authentication credentials for the target resource. | [`UnauthorizedException`](../../doc/models/unauthorized-exception.md) |
| 404 | Location Not Found | [`V2ChargeSessionRetrieve404ErrorException`](../../doc/models/v2-charge-session-retrieve-404-error-exception.md) |
| 429 | The Request reached maximum allocated rate limit | [`TooManyRequestsException`](../../doc/models/too-many-requests-exception.md) |
| 500 | Internal Server error | [`InternalServerErrorException`](../../doc/models/internal-server-error-exception.md) |
| 503 | Service unavailable | [`ServiceunavailableException`](../../doc/models/serviceunavailable-exception.md) |


# Active

Fetrches the active sessions for user.

```java
CompletableFuture<ActiveResponse200Json> activeAsync(
    final UUID requestId,
    final String emaId)
```

## Authentication

This endpoint requires [BearerAuth](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `UUID` | Header, Required | RequestId must be unique identifier value that can be used by the consumer to correlate each request /response .<br>Format.<br> Its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens) <br> |
| `emaId` | `String` | Query, Required | Emobility Account Identifier(Ema-ID)<br><br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `19` |

## Response Type

**200**: SUCCESS

[`ActiveResponse200Json`](../../doc/models/active-response-200-json.md)

## Example Usage

```java
UUID requestId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
String emaId = "NL-TNM-C0216599X-A";

chargingController.activeAsync(requestId, emaId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "status": "SUCCESS",
  "data": [
    {
      "id": "78b5d7a3-bdba-43d7-9851-1c84fcddb782",
      "userId": "281482b6-2c9a-4fd1-b3ea-1928edb40ef9",
      "emaId": "NL-TNM-C00122045-K",
      "evseId": "NL*TNM*E02003451*0",
      "startedAt": "2015-08-19T11:20:27Z",
      "stoppedAt": "2015-08-19T11:20:27Z",
      "SessionState": {
        "status": "Started"
      },
      "lastUpdated": "2024-07-17T07:36:57.985998Z"
    }
  ]
}
```

