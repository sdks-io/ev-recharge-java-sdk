
# Getting Started with Shell EV

## Introduction

This API Product provides the option to manage charging at all public Shell Recharge locations. The end points provides control to start, stop and get status of the charging session.

Supported Function

* Start a charging session
* Stop a charging session
* Retrieve the status of a charging session
* Retrieve the list of all active sessions for a card   termsOfService: 'https://developer.shell.com/terms-of-use'

Go to the Shell Developer Portal: [https://developer.shell.com](https://developer.shell.com)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>ev-recharge-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/ev-recharge-sdk/1.0.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ShellEVLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `env` | `EnvEnum` | This variable specifies the type of environment. Environments:<br><br>* `api` - Production<br>* `api-test` - UAT<br>*Default*: `EnvEnum.ENUM_APITESTSHELLCOM` |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `clientCredentialsAuth` | [`ClientCredentialsAuth`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/$a/https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
ShellEVClient client = new ShellEVClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .env(EnvEnum.ENUM_APITESTSHELLCOM)
    .build();
```

## Authorization

This API uses the following authentication schemes.

* [`BearerAuth (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/$a/https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/oauth-2-client-credentials-grant.md)

## List of APIs

* [O Auth Authorization](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/controllers/o-auth-authorization.md)
* [Charging](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/controllers/charging.md)
* [Locations](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/controllers/locations.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/ev-recharge-java-sdk/tree/1.0.0/doc/http-client-configuration-builder.md)

