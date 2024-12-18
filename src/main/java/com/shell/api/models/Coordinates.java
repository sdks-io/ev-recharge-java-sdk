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
 * This is a model class for Coordinates type.
 */
public class Coordinates {
    private Double latitude;
    private Double longitude;

    /**
     * Default constructor.
     */
    public Coordinates() {
    }

    /**
     * Initialization constructor.
     * @param  latitude  Double value for latitude.
     * @param  longitude  Double value for longitude.
     */
    public Coordinates(
            Double latitude,
            Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Getter for Latitude.
     * Latitude of the Coordinate
     * @return Returns the Double
     */
    @JsonGetter("latitude")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Setter for Latitude.
     * Latitude of the Coordinate
     * @param latitude Value for Double
     */
    @JsonSetter("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for Longitude.
     * Longitude of the Coordinate
     * @return Returns the Double
     */
    @JsonGetter("longitude")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Setter for Longitude.
     * Longitude of the Coordinate
     * @param longitude Value for Double
     */
    @JsonSetter("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Converts this Coordinates into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Coordinates [" + "latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    /**
     * Builds a new {@link Coordinates.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Coordinates.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .latitude(getLatitude())
                .longitude(getLongitude());
        return builder;
    }

    /**
     * Class to build instances of {@link Coordinates}.
     */
    public static class Builder {
        private Double latitude;
        private Double longitude;



        /**
         * Setter for latitude.
         * @param  latitude  Double value for latitude.
         * @return Builder
         */
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Setter for longitude.
         * @param  longitude  Double value for longitude.
         * @return Builder
         */
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Builds a new {@link Coordinates} object using the set fields.
         * @return {@link Coordinates}
         */
        public Coordinates build() {
            return new Coordinates(latitude, longitude);
        }
    }
}
