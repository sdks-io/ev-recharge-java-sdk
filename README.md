
# Getting Started with Shell EV

## Introduction

This API Product provides the list of all Shell Recharge locations. The list includes all Shell Recharge network and all locations available through our roaming partners.

Supported Functions

* Get the list of all the locations and its details.
* Get the details of a particular location.
* Get the list of locations nearby using the latitude and longitude.
* Get the list of locations for a given set of bounds with different zoom levels.

The Charging endpoints provides control to start, stop and get status of the charging session.

Supported Functions

* Start a charging session\n
* Stop a charging session \n
* Retrieve the status of a charging session \n
* Retrieve the list of all active sessions for a card

Go to the Shell Developer Portal: [https://developer.shell.com](https://developer.shell.com)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>ev-recharge-sdk</artifactId>
  <version>2.1.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/ev-recharge-sdk/2.1.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ShellEVLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | [`Environment`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/README.md#environments) | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| clientCredentialsAuth | [`ClientCredentialsAuth`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
import com.shell.api.Environment;
import com.shell.api.ShellEVClient;
import com.shell.api.authentication.ClientCredentialsAuthModel;
import com.shell.api.exceptions.ApiException;
import com.shell.api.models.OAuthToken;
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
            .environment(Environment.PRODUCTION)
            .build();

    }
}
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| PRODUCTION | **Default** Production Server |
| ENVIRONMENT2 | Test Server |

## Authorization

This API uses the following authentication schemes.

* [`BearerAuth (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Locations](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/controllers/locations.md)
* [Charging](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/controllers/charging.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/api-exception.md)
* [ApiHelper](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/api-helper.md)
* [FileWrapper](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/file-wrapper.md)
* [DateTimeHelper](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/2.1.0/doc/date-time-helper.md)

