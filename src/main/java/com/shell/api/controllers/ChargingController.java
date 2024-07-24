/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shell.api.ApiHelper;
import com.shell.api.Server;
import com.shell.api.exceptions.ApiException;
import com.shell.api.exceptions.BadRequestException;
import com.shell.api.exceptions.InternalServerErrorException;
import com.shell.api.exceptions.NotFoundException;
import com.shell.api.exceptions.ServiceunavailableException;
import com.shell.api.exceptions.TooManyRequestsException;
import com.shell.api.exceptions.UnauthorizedException;
import com.shell.api.http.request.HttpMethod;
import com.shell.api.models.ActiveResponse200Json;
import com.shell.api.models.ChargesessionStartBody;
import com.shell.api.models.GetChargeSessionRetrieveResponse200Json;
import com.shell.api.models.InlineResponse202;
import com.shell.api.models.InlineResponse2021;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ChargingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ChargingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint start the charging session for the user.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  body  Optional parameter: Example:
     * @return    Returns the InlineResponse202 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InlineResponse202 start(
            final UUID requestId,
            final ChargesessionStartBody body) throws ApiException, IOException {
        return prepareStartRequest(requestId, body).execute();
    }

    /**
     * This endpoint start the charging session for the user.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  body  Optional parameter: Example:
     * @return    Returns the InlineResponse202 response from the API call
     */
    public CompletableFuture<InlineResponse202> startAsync(
            final UUID requestId,
            final ChargesessionStartBody body) {
        try { 
            return prepareStartRequest(requestId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for start.
     */
    private ApiCall<InlineResponse202, ApiException> prepareStartRequest(
            final UUID requestId,
            final ChargesessionStartBody body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<InlineResponse202, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/ev/v1/charge-session/start")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("RequestId")
                                .value(String.valueOf(requestId)).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BearerAuth"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InlineResponse202.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).",
                                (reason, context) -> new BadRequestException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("The request has not been applied because it lacks valid authentication credentials for the target resource.",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Location Not Found",
                                (reason, context) -> new NotFoundException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The Request reached maximum allocated rate limit",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server error",
                                (reason, context) -> new InternalServerErrorException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service unavailable",
                                (reason, context) -> new ServiceunavailableException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Accepts a request to stop an active session when a valid session id is provided.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  sessionId  Required parameter: Session Id
     * @return    Returns the InlineResponse2021 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InlineResponse2021 stop(
            final UUID requestId,
            final String sessionId) throws ApiException, IOException {
        return prepareStopRequest(requestId, sessionId).execute();
    }

    /**
     * Accepts a request to stop an active session when a valid session id is provided.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  sessionId  Required parameter: Session Id
     * @return    Returns the InlineResponse2021 response from the API call
     */
    public CompletableFuture<InlineResponse2021> stopAsync(
            final UUID requestId,
            final String sessionId) {
        try { 
            return prepareStopRequest(requestId, sessionId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stop.
     */
    private ApiCall<InlineResponse2021, ApiException> prepareStopRequest(
            final UUID requestId,
            final String sessionId) throws IOException {
        return new ApiCall.Builder<InlineResponse2021, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/ev/v1/charge-session/stop")
                        .queryParam(param -> param.key("sessionId")
                                .value(sessionId))
                        .headerParam(param -> param.key("RequestId")
                                .value(String.valueOf(requestId)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BearerAuth"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InlineResponse2021.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).",
                                (reason, context) -> new BadRequestException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("The request has not been applied because it lacks valid authentication credentials for the target resource.",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Location Not Found",
                                (reason, context) -> new NotFoundException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The Request reached maximum allocated rate limit",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server error",
                                (reason, context) -> new InternalServerErrorException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service unavailable",
                                (reason, context) -> new ServiceunavailableException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint returns the details of the session if the session is found.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  sessionId  Required parameter: Session Id
     * @return    Returns the GetChargeSessionRetrieveResponse200Json response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetChargeSessionRetrieveResponse200Json getChargeSessionRetrieve(
            final UUID requestId,
            final String sessionId) throws ApiException, IOException {
        return prepareGetChargeSessionRetrieveRequest(requestId, sessionId).execute();
    }

    /**
     * This endpoint returns the details of the session if the session is found.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  sessionId  Required parameter: Session Id
     * @return    Returns the GetChargeSessionRetrieveResponse200Json response from the API call
     */
    public CompletableFuture<GetChargeSessionRetrieveResponse200Json> getChargeSessionRetrieveAsync(
            final UUID requestId,
            final String sessionId) {
        try { 
            return prepareGetChargeSessionRetrieveRequest(requestId, sessionId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getChargeSessionRetrieve.
     */
    private ApiCall<GetChargeSessionRetrieveResponse200Json, ApiException> prepareGetChargeSessionRetrieveRequest(
            final UUID requestId,
            final String sessionId) throws IOException {
        return new ApiCall.Builder<GetChargeSessionRetrieveResponse200Json, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/ev/v1/charge-session/retrieve")
                        .queryParam(param -> param.key("sessionId")
                                .value(sessionId))
                        .headerParam(param -> param.key("RequestId")
                                .value(String.valueOf(requestId)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BearerAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetChargeSessionRetrieveResponse200Json.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).",
                                (reason, context) -> new BadRequestException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("The request has not been applied because it lacks valid authentication credentials for the target resource.",
                                (reason, context) -> new UnauthorizedException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Location Not Found",
                                (reason, context) -> new NotFoundException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("The Request reached maximum allocated rate limit",
                                (reason, context) -> new TooManyRequestsException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server error",
                                (reason, context) -> new InternalServerErrorException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service unavailable",
                                (reason, context) -> new ServiceunavailableException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Fetrches the active sessions for user.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  emaId  Required parameter: Emobility Account Identifier(Ema-ID)
     * @return    Returns the ActiveResponse200Json response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ActiveResponse200Json active(
            final UUID requestId,
            final String emaId) throws ApiException, IOException {
        return prepareActiveRequest(requestId, emaId).execute();
    }

    /**
     * Fetrches the active sessions for user.
     * @param  requestId  Required parameter: RequestId must be unique identifier value that can be
     *         used by the consumer to correlate each request /response .&lt;br&gt;Format.&lt;br&gt;
     *         Its canonical textual representation, the 16 octets of a UUID are represented as 32
     *         hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the
     *         form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4
     *         hyphens) &lt;br&gt;
     * @param  emaId  Required parameter: Emobility Account Identifier(Ema-ID)
     * @return    Returns the ActiveResponse200Json response from the API call
     */
    public CompletableFuture<ActiveResponse200Json> activeAsync(
            final UUID requestId,
            final String emaId) {
        try { 
            return prepareActiveRequest(requestId, emaId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for active.
     */
    private ApiCall<ActiveResponse200Json, ApiException> prepareActiveRequest(
            final UUID requestId,
            final String emaId) throws IOException {
        return new ApiCall.Builder<ActiveResponse200Json, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/ev/v1/charge-session/active")
                        .queryParam(param -> param.key("emaId")
                                .value(emaId))
                        .headerParam(param -> param.key("RequestId")
                                .value(String.valueOf(requestId)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BearerAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ActiveResponse200Json.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}