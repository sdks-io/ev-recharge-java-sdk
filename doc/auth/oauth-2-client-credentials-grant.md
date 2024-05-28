
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for BearerAuth.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthTokenProvider | `BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken>` | Registers a callback for oAuth Token Provider used for automatic token fetching/refreshing. | `oAuthTokenProvider` | `getOAuthTokenProvider()` |
| OAuthOnTokenUpdate | `Consumer<OAuthToken>` | Registers a callback for token update event. | `oAuthOnTokenUpdate` | `getOAuthOnTokenUpdate()` |



**Note:** Auth credentials can be set using `clientCredentialsAuth` in the client builder and accessed through `getClientCredentialsAuth` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet. This will fetch the OAuth token automatically when any of the endpoints, requiring *OAuth 2.0 Client Credentials Grant* autentication, are called.

```java
ShellEVClient client = new ShellEVClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .build();
```



Your application can also manually provide an OAuthToken using the setter `oAuthToken` in `ClientCredentialsAuthModel` object. This function takes in an instance of OAuthToken containing information for authorizing client requests and refreshing the token itself.

### Adding OAuth Token Update Callback

Whenever the OAuth Token gets updated, the provided callback implementation will be executed. For instance, you may use it store your access token whenever it gets updated.

```java
ShellEVClient client = new ShellEVClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthOnTokenUpdate(oAuthToken -> {
                // Add the callback handler to perform operations like save to DB or file etc.
                // It will be triggered whenever the token gets updated
                System.out.println(oAuthToken);
        })
        .build())
    .build();
```

### Adding Custom OAuth Token Provider

To authorize a client from a stored access token, set up the `oAuthTokenProvider` in `ClientCredentialsAuthModel` builder along with the other auth parameters before creating the client:

```java
ShellEVClient client = new ShellEVClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthTokenProvider((lastOAuthToken, credentialsManager) -> {
                // Add the callback handler to provide a new OAuth token
                // It will be triggered whenever the lastOAuthToken is undefined or expired
                return lastOAuthToken.toBuilder()
                        .expiry(lastOAuthToken.getExpiry() + 60)
                        .build();
        })
        .build())
    .build();
```

