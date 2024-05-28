/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SingleLocationMarker type.
 */
public class SingleLocationMarker {
    private String markerType;
    private String uniqueKey;
    private SingleLocationMarkerStatusEnum status;
    private Coordinates coordinates;
    private Double evseCount;
    private Double maxPower;
    private String geoHash;
    private Double locationUid;
    private List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods;
    private String operatorId;

    /**
     * Default constructor.
     */
    public SingleLocationMarker() {
    }

    /**
     * Initialization constructor.
     * @param  markerType  String value for markerType.
     * @param  uniqueKey  String value for uniqueKey.
     * @param  status  SingleLocationMarkerStatusEnum value for status.
     * @param  coordinates  Coordinates value for coordinates.
     * @param  evseCount  Double value for evseCount.
     * @param  maxPower  Double value for maxPower.
     * @param  geoHash  String value for geoHash.
     * @param  locationUid  Double value for locationUid.
     * @param  authorizationMethods  List of SingleLocationMarkerAuthorizationMethodsItemsEnum value
     *         for authorizationMethods.
     * @param  operatorId  String value for operatorId.
     */
    public SingleLocationMarker(
            String markerType,
            String uniqueKey,
            SingleLocationMarkerStatusEnum status,
            Coordinates coordinates,
            Double evseCount,
            Double maxPower,
            String geoHash,
            Double locationUid,
            List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods,
            String operatorId) {
        this.markerType = markerType;
        this.uniqueKey = uniqueKey;
        this.status = status;
        this.coordinates = coordinates;
        this.evseCount = evseCount;
        this.maxPower = maxPower;
        this.geoHash = geoHash;
        this.locationUid = locationUid;
        this.authorizationMethods = authorizationMethods;
        this.operatorId = operatorId;
    }

    /**
     * Initialization constructor.
     * @param  markerType  String value for markerType.
     */
    @JsonCreator
    protected SingleLocationMarker(
            @JsonProperty("markerType") String markerType) {
        this(markerType, null, null, null, null, null, null, null, null, null);
    }

    /**
     * Getter for MarkerType.
     * Identifies the marker type. If it''s a `SingleLocationMarker`, then the value is
     * `SingleLocation`
     * @return Returns the String
     */
    @JsonGetter("markerType")
    public String getMarkerType() {
        return markerType;
    }

    /**
     * Setter for MarkerType.
     * Identifies the marker type. If it''s a `SingleLocationMarker`, then the value is
     * `SingleLocation`
     * @param markerType Value for String
     */
    @JsonSetter("markerType")
    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }

    /**
     * Getter for UniqueKey.
     * Uniquely identifies the marker object
     * @return Returns the String
     */
    @JsonGetter("uniqueKey")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Setter for UniqueKey.
     * Uniquely identifies the marker object
     * @param uniqueKey Value for String
     */
    @JsonSetter("uniqueKey")
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    /**
     * Getter for Status.
     * Minimum of all status values in the Marker, e.g. if at least one Evse in the Marker is
     * available, the value will be available
     * @return Returns the SingleLocationMarkerStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SingleLocationMarkerStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Minimum of all status values in the Marker, e.g. if at least one Evse in the Marker is
     * available, the value will be available
     * @param status Value for SingleLocationMarkerStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(SingleLocationMarkerStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for Coordinates.
     * Coordinates of the Shell Recharge Site Location
     * @return Returns the Coordinates
     */
    @JsonGetter("coordinates")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Setter for Coordinates.
     * Coordinates of the Shell Recharge Site Location
     * @param coordinates Value for Coordinates
     */
    @JsonSetter("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Getter for EvseCount.
     * Total number of Evse units in Locations that this Marker represents
     * @return Returns the Double
     */
    @JsonGetter("evseCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getEvseCount() {
        return evseCount;
    }

    /**
     * Setter for EvseCount.
     * Total number of Evse units in Locations that this Marker represents
     * @param evseCount Value for Double
     */
    @JsonSetter("evseCount")
    public void setEvseCount(Double evseCount) {
        this.evseCount = evseCount;
    }

    /**
     * Getter for MaxPower.
     * Maximum power in kW across all locations grouped in this marker (disregarding availability)
     * @return Returns the Double
     */
    @JsonGetter("maxPower")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getMaxPower() {
        return maxPower;
    }

    /**
     * Setter for MaxPower.
     * Maximum power in kW across all locations grouped in this marker (disregarding availability)
     * @param maxPower Value for Double
     */
    @JsonSetter("maxPower")
    public void setMaxPower(Double maxPower) {
        this.maxPower = maxPower;
    }

    /**
     * Getter for GeoHash.
     * GeoHash of marker coordinates
     * @return Returns the String
     */
    @JsonGetter("geoHash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGeoHash() {
        return geoHash;
    }

    /**
     * Setter for GeoHash.
     * GeoHash of marker coordinates
     * @param geoHash Value for String
     */
    @JsonSetter("geoHash")
    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash;
    }

    /**
     * Getter for LocationUid.
     * Unique ID of the Location this Marker represents
     * @return Returns the Double
     */
    @JsonGetter("locationUid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLocationUid() {
        return locationUid;
    }

    /**
     * Setter for LocationUid.
     * Unique ID of the Location this Marker represents
     * @param locationUid Value for Double
     */
    @JsonSetter("locationUid")
    public void setLocationUid(Double locationUid) {
        this.locationUid = locationUid;
    }

    /**
     * Getter for AuthorizationMethods.
     * Methods that can be used to Authorize sessions on this EVSE
     * @return Returns the List of SingleLocationMarkerAuthorizationMethodsItemsEnum
     */
    @JsonGetter("authorizationMethods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SingleLocationMarkerAuthorizationMethodsItemsEnum> getAuthorizationMethods() {
        return authorizationMethods;
    }

    /**
     * Setter for AuthorizationMethods.
     * Methods that can be used to Authorize sessions on this EVSE
     * @param authorizationMethods Value for List of SingleLocationMarkerAuthorizationMethodsItemsEnum
     */
    @JsonSetter("authorizationMethods")
    public void setAuthorizationMethods(List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) {
        this.authorizationMethods = authorizationMethods;
    }

    /**
     * Getter for OperatorId.
     * Unique Id of the operator
     * @return Returns the String
     */
    @JsonGetter("operatorId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Setter for OperatorId.
     * Unique Id of the operator
     * @param operatorId Value for String
     */
    @JsonSetter("operatorId")
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Converts this SingleLocationMarker into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SingleLocationMarker [" + "markerType=" + markerType + ", uniqueKey=" + uniqueKey
                + ", status=" + status + ", coordinates=" + coordinates + ", evseCount=" + evseCount
                + ", maxPower=" + maxPower + ", geoHash=" + geoHash + ", locationUid=" + locationUid
                + ", authorizationMethods=" + authorizationMethods + ", operatorId=" + operatorId
                + "]";
    }

    /**
     * Builds a new {@link SingleLocationMarker.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SingleLocationMarker.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(markerType)
                .uniqueKey(getUniqueKey())
                .status(getStatus())
                .coordinates(getCoordinates())
                .evseCount(getEvseCount())
                .maxPower(getMaxPower())
                .geoHash(getGeoHash())
                .locationUid(getLocationUid())
                .authorizationMethods(getAuthorizationMethods())
                .operatorId(getOperatorId());
        return builder;
    }

    /**
     * Class to build instances of {@link SingleLocationMarker}.
     */
    public static class Builder {
        private String markerType;
        private String uniqueKey;
        private SingleLocationMarkerStatusEnum status;
        private Coordinates coordinates;
        private Double evseCount;
        private Double maxPower;
        private String geoHash;
        private Double locationUid;
        private List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods;
        private String operatorId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  markerType  String value for markerType.
         */
        public Builder(String markerType) {
            this.markerType = markerType;
        }

        /**
         * Setter for markerType.
         * @param  markerType  String value for markerType.
         * @return Builder
         */
        public Builder markerType(String markerType) {
            this.markerType = markerType;
            return this;
        }

        /**
         * Setter for uniqueKey.
         * @param  uniqueKey  String value for uniqueKey.
         * @return Builder
         */
        public Builder uniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  SingleLocationMarkerStatusEnum value for status.
         * @return Builder
         */
        public Builder status(SingleLocationMarkerStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for coordinates.
         * @param  coordinates  Coordinates value for coordinates.
         * @return Builder
         */
        public Builder coordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        /**
         * Setter for evseCount.
         * @param  evseCount  Double value for evseCount.
         * @return Builder
         */
        public Builder evseCount(Double evseCount) {
            this.evseCount = evseCount;
            return this;
        }

        /**
         * Setter for maxPower.
         * @param  maxPower  Double value for maxPower.
         * @return Builder
         */
        public Builder maxPower(Double maxPower) {
            this.maxPower = maxPower;
            return this;
        }

        /**
         * Setter for geoHash.
         * @param  geoHash  String value for geoHash.
         * @return Builder
         */
        public Builder geoHash(String geoHash) {
            this.geoHash = geoHash;
            return this;
        }

        /**
         * Setter for locationUid.
         * @param  locationUid  Double value for locationUid.
         * @return Builder
         */
        public Builder locationUid(Double locationUid) {
            this.locationUid = locationUid;
            return this;
        }

        /**
         * Setter for authorizationMethods.
         * @param  authorizationMethods  List of SingleLocationMarkerAuthorizationMethodsItemsEnum
         *         value for authorizationMethods.
         * @return Builder
         */
        public Builder authorizationMethods(
                List<SingleLocationMarkerAuthorizationMethodsItemsEnum> authorizationMethods) {
            this.authorizationMethods = authorizationMethods;
            return this;
        }

        /**
         * Setter for operatorId.
         * @param  operatorId  String value for operatorId.
         * @return Builder
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * Builds a new {@link SingleLocationMarker} object using the set fields.
         * @return {@link SingleLocationMarker}
         */
        public SingleLocationMarker build() {
            return new SingleLocationMarker(markerType, uniqueKey, status, coordinates, evseCount,
                    maxPower, geoHash, locationUid, authorizationMethods, operatorId);
        }
    }
}
