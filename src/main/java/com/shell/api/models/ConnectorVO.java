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
 * This is a model class for ConnectorVO type.
 */
public class ConnectorVO {
    private Integer uid;
    private String externalId;
    private ConnectorVOConnectorTypeEnum connectorType;
    private ElectricalProperties electricalProperties;
    private Boolean fixedCable;
    private Tariff tariff;
    private String updated;
    private ConnectorVOUpdatedByEnum updatedBy;
    private String deleted;

    /**
     * Default constructor.
     */
    public ConnectorVO() {
    }

    /**
     * Initialization constructor.
     * @param  uid  Integer value for uid.
     * @param  externalId  String value for externalId.
     * @param  connectorType  ConnectorVOConnectorTypeEnum value for connectorType.
     * @param  electricalProperties  ElectricalProperties value for electricalProperties.
     * @param  fixedCable  Boolean value for fixedCable.
     * @param  tariff  Tariff value for tariff.
     * @param  updated  String value for updated.
     * @param  updatedBy  ConnectorVOUpdatedByEnum value for updatedBy.
     * @param  deleted  String value for deleted.
     */
    public ConnectorVO(
            Integer uid,
            String externalId,
            ConnectorVOConnectorTypeEnum connectorType,
            ElectricalProperties electricalProperties,
            Boolean fixedCable,
            Tariff tariff,
            String updated,
            ConnectorVOUpdatedByEnum updatedBy,
            String deleted) {
        this.uid = uid;
        this.externalId = externalId;
        this.connectorType = connectorType;
        this.electricalProperties = electricalProperties;
        this.fixedCable = fixedCable;
        this.tariff = tariff;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
    }

    /**
     * Getter for Uid.
     * Internal identifier used to refer to this Connector
     * @return Returns the Integer
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Internal identifier used to refer to this Connector
     * @param uid Value for Integer
     */
    @JsonSetter("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * Getter for ExternalId.
     * Identifier of the Evse as given by the Operator, unique for the containing EVSE'
     * @return Returns the String
     */
    @JsonGetter("externalId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExternalId() {
        return externalId;
    }

    /**
     * Setter for ExternalId.
     * Identifier of the Evse as given by the Operator, unique for the containing EVSE'
     * @param externalId Value for String
     */
    @JsonSetter("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for ConnectorType.
     * @return Returns the ConnectorVOConnectorTypeEnum
     */
    @JsonGetter("connectorType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConnectorVOConnectorTypeEnum getConnectorType() {
        return connectorType;
    }

    /**
     * Setter for ConnectorType.
     * @param connectorType Value for ConnectorVOConnectorTypeEnum
     */
    @JsonSetter("connectorType")
    public void setConnectorType(ConnectorVOConnectorTypeEnum connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * Getter for ElectricalProperties.
     * Electrical Properties of the Connector
     * @return Returns the ElectricalProperties
     */
    @JsonGetter("electricalProperties")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectricalProperties getElectricalProperties() {
        return electricalProperties;
    }

    /**
     * Setter for ElectricalProperties.
     * Electrical Properties of the Connector
     * @param electricalProperties Value for ElectricalProperties
     */
    @JsonSetter("electricalProperties")
    public void setElectricalProperties(ElectricalProperties electricalProperties) {
        this.electricalProperties = electricalProperties;
    }

    /**
     * Getter for FixedCable.
     * Indicates whether Connector has a fixed cable attached. False by default (not sent in this
     * case)
     * @return Returns the Boolean
     */
    @JsonGetter("fixedCable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFixedCable() {
        return fixedCable;
    }

    /**
     * Setter for FixedCable.
     * Indicates whether Connector has a fixed cable attached. False by default (not sent in this
     * case)
     * @param fixedCable Value for Boolean
     */
    @JsonSetter("fixedCable")
    public void setFixedCable(Boolean fixedCable) {
        this.fixedCable = fixedCable;
    }

    /**
     * Getter for Tariff.
     * @return Returns the Tariff
     */
    @JsonGetter("tariff")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Tariff getTariff() {
        return tariff;
    }

    /**
     * Setter for Tariff.
     * @param tariff Value for Tariff
     */
    @JsonSetter("tariff")
    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    /**
     * Getter for Updated.
     * ISO8601-compliant UTC datetime of the last update of the Connector’s data
     * @return Returns the String
     */
    @JsonGetter("updated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdated() {
        return updated;
    }

    /**
     * Setter for Updated.
     * ISO8601-compliant UTC datetime of the last update of the Connector’s data
     * @param updated Value for String
     */
    @JsonSetter("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * Getter for UpdatedBy.
     * @return Returns the ConnectorVOUpdatedByEnum
     */
    @JsonGetter("updatedBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConnectorVOUpdatedByEnum getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Setter for UpdatedBy.
     * @param updatedBy Value for ConnectorVOUpdatedByEnum
     */
    @JsonSetter("updatedBy")
    public void setUpdatedBy(ConnectorVOUpdatedByEnum updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for Deleted.
     * optional ISO8601-compliant UTC deletion timestamp of the connector
     * @return Returns the String
     */
    @JsonGetter("deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * optional ISO8601-compliant UTC deletion timestamp of the connector
     * @param deleted Value for String
     */
    @JsonSetter("deleted")
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * Converts this ConnectorVO into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectorVO [" + "uid=" + uid + ", externalId=" + externalId + ", connectorType="
                + connectorType + ", electricalProperties=" + electricalProperties + ", fixedCable="
                + fixedCable + ", tariff=" + tariff + ", updated=" + updated + ", updatedBy="
                + updatedBy + ", deleted=" + deleted + "]";
    }

    /**
     * Builds a new {@link ConnectorVO.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectorVO.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .externalId(getExternalId())
                .connectorType(getConnectorType())
                .electricalProperties(getElectricalProperties())
                .fixedCable(getFixedCable())
                .tariff(getTariff())
                .updated(getUpdated())
                .updatedBy(getUpdatedBy())
                .deleted(getDeleted());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectorVO}.
     */
    public static class Builder {
        private Integer uid;
        private String externalId;
        private ConnectorVOConnectorTypeEnum connectorType;
        private ElectricalProperties electricalProperties;
        private Boolean fixedCable;
        private Tariff tariff;
        private String updated;
        private ConnectorVOUpdatedByEnum updatedBy;
        private String deleted;



        /**
         * Setter for uid.
         * @param  uid  Integer value for uid.
         * @return Builder
         */
        public Builder uid(Integer uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for externalId.
         * @param  externalId  String value for externalId.
         * @return Builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Setter for connectorType.
         * @param  connectorType  ConnectorVOConnectorTypeEnum value for connectorType.
         * @return Builder
         */
        public Builder connectorType(ConnectorVOConnectorTypeEnum connectorType) {
            this.connectorType = connectorType;
            return this;
        }

        /**
         * Setter for electricalProperties.
         * @param  electricalProperties  ElectricalProperties value for electricalProperties.
         * @return Builder
         */
        public Builder electricalProperties(ElectricalProperties electricalProperties) {
            this.electricalProperties = electricalProperties;
            return this;
        }

        /**
         * Setter for fixedCable.
         * @param  fixedCable  Boolean value for fixedCable.
         * @return Builder
         */
        public Builder fixedCable(Boolean fixedCable) {
            this.fixedCable = fixedCable;
            return this;
        }

        /**
         * Setter for tariff.
         * @param  tariff  Tariff value for tariff.
         * @return Builder
         */
        public Builder tariff(Tariff tariff) {
            this.tariff = tariff;
            return this;
        }

        /**
         * Setter for updated.
         * @param  updated  String value for updated.
         * @return Builder
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        /**
         * Setter for updatedBy.
         * @param  updatedBy  ConnectorVOUpdatedByEnum value for updatedBy.
         * @return Builder
         */
        public Builder updatedBy(ConnectorVOUpdatedByEnum updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  String value for deleted.
         * @return Builder
         */
        public Builder deleted(String deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Builds a new {@link ConnectorVO} object using the set fields.
         * @return {@link ConnectorVO}
         */
        public ConnectorVO build() {
            return new ConnectorVO(uid, externalId, connectorType, electricalProperties, fixedCable,
                    tariff, updated, updatedBy, deleted);
        }
    }
}
