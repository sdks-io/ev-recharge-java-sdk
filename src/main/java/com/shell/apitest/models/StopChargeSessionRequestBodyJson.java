/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for StopChargeSessionRequestBodyJson type.
 */
public class StopChargeSessionRequestBodyJson {
    private String sesssionId;

    /**
     * Default constructor.
     */
    public StopChargeSessionRequestBodyJson() {
    }

    /**
     * Initialization constructor.
     * @param  sesssionId  String value for sesssionId.
     */
    public StopChargeSessionRequestBodyJson(
            String sesssionId) {
        this.sesssionId = sesssionId;
    }

    /**
     * Getter for SesssionId.
     * Session Id is to be fetched
     * @return Returns the String
     */
    @JsonGetter("SesssionId")
    public String getSesssionId() {
        return sesssionId;
    }

    /**
     * Setter for SesssionId.
     * Session Id is to be fetched
     * @param sesssionId Value for String
     */
    @JsonSetter("SesssionId")
    public void setSesssionId(String sesssionId) {
        this.sesssionId = sesssionId;
    }

    /**
     * Converts this StopChargeSessionRequestBodyJson into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StopChargeSessionRequestBodyJson [" + "sesssionId=" + sesssionId + "]";
    }

    /**
     * Builds a new {@link StopChargeSessionRequestBodyJson.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StopChargeSessionRequestBodyJson.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sesssionId);
        return builder;
    }

    /**
     * Class to build instances of {@link StopChargeSessionRequestBodyJson}.
     */
    public static class Builder {
        private String sesssionId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sesssionId  String value for sesssionId.
         */
        public Builder(String sesssionId) {
            this.sesssionId = sesssionId;
        }

        /**
         * Setter for sesssionId.
         * @param  sesssionId  String value for sesssionId.
         * @return Builder
         */
        public Builder sesssionId(String sesssionId) {
            this.sesssionId = sesssionId;
            return this;
        }

        /**
         * Builds a new {@link StopChargeSessionRequestBodyJson} object using the set fields.
         * @return {@link StopChargeSessionRequestBodyJson}
         */
        public StopChargeSessionRequestBodyJson build() {
            return new StopChargeSessionRequestBodyJson(sesssionId);
        }
    }
}