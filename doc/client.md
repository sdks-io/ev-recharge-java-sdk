
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | [`Environment`](../README.md#environments) | The API environment. <br> **Default: `Environment.SIT`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](../doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| clientCredentialsAuth | [`ClientCredentialsAuth`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
import com.shell.apitest.Environment;
import com.shell.apitest.ShellEVClient;
import com.shell.apitest.authentication.ClientCredentialsAuthModel;
import com.shell.apitest.exceptions.ApiException;
import com.shell.apitest.models.OAuthToken;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        ShellEVClient client = new ShellEVClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .environment(Environment.SIT)
            .build();

    }
}
```

## Shell EVClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getLocationsController()` | Provides access to Locations controller. | `LocationsController` |
| `getChargingController()` | Provides access to Charging controller. | `ChargingController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getClientCredentialsAuth()` | The credentials to use with ClientCredentialsAuth. | [`ClientCredentialsAuth`](auth/oauth-2-client-credentials-grant.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

