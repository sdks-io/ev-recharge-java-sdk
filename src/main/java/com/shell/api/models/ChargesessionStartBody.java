/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ChargesessionStartBody type.
 */
public class ChargesessionStartBody {
    private String evChargeNumber;
    private String evseId;

    /**
     * Default constructor.
     */
    public ChargesessionStartBody() {
    }

    /**
     * Initialization constructor.
     * @param  evChargeNumber  String value for evChargeNumber.
     * @param  evseId  String value for evseId.
     */
    public ChargesessionStartBody(
            String evChargeNumber,
            String evseId) {
        this.evChargeNumber = evChargeNumber;
        this.evseId = evseId;
    }

    /**
     * Getter for EvChargeNumber.
     * Ev charge number
     * @return Returns the String
     */
    @JsonGetter("evChargeNumber")
    public String getEvChargeNumber() {
        return evChargeNumber;
    }

    /**
     * Setter for EvChargeNumber.
     * Ev charge number
     * @param evChargeNumber Value for String
     */
    @JsonSetter("evChargeNumber")
    public void setEvChargeNumber(String evChargeNumber) {
        this.evChargeNumber = evChargeNumber;
    }

    /**
     * Getter for EvseId.
     * This is the Electric Vehicle EquipmentID
     * @return Returns the String
     */
    @JsonGetter("evseId")
    public String getEvseId() {
        return evseId;
    }

    /**
     * Setter for EvseId.
     * This is the Electric Vehicle EquipmentID
     * @param evseId Value for String
     */
    @JsonSetter("evseId")
    public void setEvseId(String evseId) {
        this.evseId = evseId;
    }

    /**
     * Converts this ChargesessionStartBody into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargesessionStartBody [" + "evChargeNumber=" + evChargeNumber + ", evseId="
                + evseId + "]";
    }

    /**
     * Builds a new {@link ChargesessionStartBody.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargesessionStartBody.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(evChargeNumber, evseId);
        return builder;
    }

    /**
     * Class to build instances of {@link ChargesessionStartBody}.
     */
    public static class Builder {
        private String evChargeNumber;
        private String evseId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  evChargeNumber  String value for evChargeNumber.
         * @param  evseId  String value for evseId.
         */
        public Builder(String evChargeNumber, String evseId) {
            this.evChargeNumber = evChargeNumber;
            this.evseId = evseId;
        }

        /**
         * Setter for evChargeNumber.
         * @param  evChargeNumber  String value for evChargeNumber.
         * @return Builder
         */
        public Builder evChargeNumber(String evChargeNumber) {
            this.evChargeNumber = evChargeNumber;
            return this;
        }

        /**
         * Setter for evseId.
         * @param  evseId  String value for evseId.
         * @return Builder
         */
        public Builder evseId(String evseId) {
            this.evseId = evseId;
            return this;
        }

        /**
         * Builds a new {@link ChargesessionStartBody} object using the set fields.
         * @return {@link ChargesessionStartBody}
         */
        public ChargesessionStartBody build() {
            return new ChargesessionStartBody(evChargeNumber, evseId);
        }
    }
}