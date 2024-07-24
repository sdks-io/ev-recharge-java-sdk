/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for InlineResponse202Data type.
 */
public class InlineResponse202Data {
    private String sessionId;

    /**
     * Default constructor.
     */
    public InlineResponse202Data() {
    }

    /**
     * Initialization constructor.
     * @param  sessionId  String value for sessionId.
     */
    public InlineResponse202Data(
            String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Getter for SessionId.
     * Session Id for tracking.
     * @return Returns the String
     */
    @JsonGetter("sessionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Setter for SessionId.
     * Session Id for tracking.
     * @param sessionId Value for String
     */
    @JsonSetter("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Converts this InlineResponse202Data into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InlineResponse202Data [" + "sessionId=" + sessionId + "]";
    }

    /**
     * Builds a new {@link InlineResponse202Data.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InlineResponse202Data.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sessionId(getSessionId());
        return builder;
    }

    /**
     * Class to build instances of {@link InlineResponse202Data}.
     */
    public static class Builder {
        private String sessionId;



        /**
         * Setter for sessionId.
         * @param  sessionId  String value for sessionId.
         * @return Builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Builds a new {@link InlineResponse202Data} object using the set fields.
         * @return {@link InlineResponse202Data}
         */
        public InlineResponse202Data build() {
            return new InlineResponse202Data(sessionId);
        }
    }
}