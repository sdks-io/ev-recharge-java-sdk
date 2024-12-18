/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.api.models.UnauthorizedErrMsg;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for UnauthorizedException type.
 */
public class UnauthorizedException extends ApiException {
    private static final long serialVersionUID = 2168350662648869249L;
    private String requestId;
    private String status;
    private List<UnauthorizedErrMsg> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public UnauthorizedException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for RequestId.
     * requestId or correlation id of the message
     * @return Returns the String
     */
    @JsonGetter("requestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for RequestId.
     * requestId or correlation id of the message
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    private void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Status of the request
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * Status of the request
     * @param status Value for String
     */
    @JsonSetter("status")
    private void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Errors.
     * Exception details of the error
     * @return Returns the List of UnauthorizedErrMsg
     */
    @JsonGetter("errors")
    public List<UnauthorizedErrMsg> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * Exception details of the error
     * @param errors Value for List of UnauthorizedErrMsg
     */
    @JsonSetter("errors")
    private void setErrors(List<UnauthorizedErrMsg> errors) {
        this.errors = errors;
    }
}
