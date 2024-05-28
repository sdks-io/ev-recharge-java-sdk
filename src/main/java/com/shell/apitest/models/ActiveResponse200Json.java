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
import java.util.UUID;

/**
 * This is a model class for ActiveResponse200Json type.
 */
public class ActiveResponse200Json {
    private UUID requestId;
    private ActiveResponse200JsonStatusEnum status;
    private List<DataActive> data;

    /**
     * Default constructor.
     */
    public ActiveResponse200Json() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  UUID value for requestId.
     * @param  status  ActiveResponse200JsonStatusEnum value for status.
     * @param  data  List of DataActive value for data.
     */
    public ActiveResponse200Json(
            UUID requestId,
            ActiveResponse200JsonStatusEnum status,
            List<DataActive> data) {
        this.requestId = requestId;
        this.status = status;
        this.data = data;
    }

    /**
     * Getter for RequestId.
     * A unique request id in GUID format. The value is written to the Shell API Platform audit log
     * for end to end traceability of a request.
     * @return Returns the UUID
     */
    @JsonGetter("RequestId")
    public UUID getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * A unique request id in GUID format. The value is written to the Shell API Platform audit log
     * for end to end traceability of a request.
     * @param requestId Value for UUID
     */
    @JsonSetter("RequestId")
    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request
     * @return Returns the ActiveResponse200JsonStatusEnum
     */
    @JsonGetter("Status")
    public ActiveResponse200JsonStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request
     * @param status Value for ActiveResponse200JsonStatusEnum
     */
    @JsonSetter("Status")
    public void setStatus(ActiveResponse200JsonStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of DataActive
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DataActive> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of DataActive
     */
    @JsonSetter("Data")
    public void setData(List<DataActive> data) {
        this.data = data;
    }

    /**
     * Converts this ActiveResponse200Json into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActiveResponse200Json [" + "requestId=" + requestId + ", status=" + status
                + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link ActiveResponse200Json.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActiveResponse200Json.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(requestId, status)
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ActiveResponse200Json}.
     */
    public static class Builder {
        private UUID requestId;
        private ActiveResponse200JsonStatusEnum status;
        private List<DataActive> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  requestId  UUID value for requestId.
         * @param  status  ActiveResponse200JsonStatusEnum value for status.
         */
        public Builder(UUID requestId, ActiveResponse200JsonStatusEnum status) {
            this.requestId = requestId;
            this.status = status;
        }

        /**
         * Setter for requestId.
         * @param  requestId  UUID value for requestId.
         * @return Builder
         */
        public Builder requestId(UUID requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  ActiveResponse200JsonStatusEnum value for status.
         * @return Builder
         */
        public Builder status(ActiveResponse200JsonStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of DataActive value for data.
         * @return Builder
         */
        public Builder data(List<DataActive> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ActiveResponse200Json} object using the set fields.
         * @return {@link ActiveResponse200Json}
         */
        public ActiveResponse200Json build() {
            return new ActiveResponse200Json(requestId, status, data);
        }
    }
}
