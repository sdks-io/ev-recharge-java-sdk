/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for M405ErrorResponse type.
 */
public class M405ErrorResponse {
    private String requestId;
    private String status;
    private List<M405ErrorResponseError> errors;

    /**
     * Default constructor.
     */
    public M405ErrorResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  errors  List of M405ErrorResponseError value for errors.
     */
    public M405ErrorResponse(
            String requestId,
            String status,
            List<M405ErrorResponseError> errors) {
        this.requestId = requestId;
        this.status = status;
        this.errors = errors;
    }

    /**
     * Getter for RequestId.
     * Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be
     * played back in the response from the request.
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be
     * played back in the response from the request.
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request
     * @return Returns the String
     */
    @JsonGetter("Status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of M405ErrorResponseError
     */
    @JsonGetter("Errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<M405ErrorResponseError> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of M405ErrorResponseError
     */
    @JsonSetter("Errors")
    public void setErrors(List<M405ErrorResponseError> errors) {
        this.errors = errors;
    }

    /**
     * Converts this M405ErrorResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M405ErrorResponse [" + "requestId=" + requestId + ", status=" + status + ", errors="
                + errors + "]";
    }

    /**
     * Builds a new {@link M405ErrorResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M405ErrorResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(requestId, status)
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link M405ErrorResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<M405ErrorResponseError> errors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  requestId  String value for requestId.
         * @param  status  String value for status.
         */
        public Builder(String requestId, String status) {
            this.requestId = requestId;
            this.status = status;
        }

        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of M405ErrorResponseError value for errors.
         * @return Builder
         */
        public Builder errors(List<M405ErrorResponseError> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link M405ErrorResponse} object using the set fields.
         * @return {@link M405ErrorResponse}
         */
        public M405ErrorResponse build() {
            return new M405ErrorResponse(requestId, status, errors);
        }
    }
}
