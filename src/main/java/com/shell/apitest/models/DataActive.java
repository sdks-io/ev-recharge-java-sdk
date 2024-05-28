/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shell.apitest.DateTimeHelper;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * This is a model class for DataActive type.
 */
public class DataActive {
    private UUID id;
    private String userId;
    private String emaId;
    private String evseId;
    private LocalDateTime startedAt;
    private OptionalNullable<LocalDateTime> stoppedAt;
    private DataActiveSessionStateEnum sessionState;
    private OptionalNullable<DataActiveSessionCodeEnum> sessionCode;
    private OptionalNullable<String> sessionMessage;

    /**
     * Default constructor.
     */
    public DataActive() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  userId  String value for userId.
     * @param  emaId  String value for emaId.
     * @param  evseId  String value for evseId.
     * @param  startedAt  LocalDateTime value for startedAt.
     * @param  stoppedAt  LocalDateTime value for stoppedAt.
     * @param  sessionState  DataActiveSessionStateEnum value for sessionState.
     * @param  sessionCode  DataActiveSessionCodeEnum value for sessionCode.
     * @param  sessionMessage  String value for sessionMessage.
     */
    public DataActive(
            UUID id,
            String userId,
            String emaId,
            String evseId,
            LocalDateTime startedAt,
            LocalDateTime stoppedAt,
            DataActiveSessionStateEnum sessionState,
            DataActiveSessionCodeEnum sessionCode,
            String sessionMessage) {
        this.id = id;
        this.userId = userId;
        this.emaId = emaId;
        this.evseId = evseId;
        this.startedAt = startedAt;
        this.stoppedAt = OptionalNullable.of(stoppedAt);
        this.sessionState = sessionState;
        this.sessionCode = OptionalNullable.of(sessionCode);
        this.sessionMessage = OptionalNullable.of(sessionMessage);
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  userId  String value for userId.
     * @param  emaId  String value for emaId.
     * @param  evseId  String value for evseId.
     * @param  startedAt  LocalDateTime value for startedAt.
     * @param  stoppedAt  LocalDateTime value for stoppedAt.
     * @param  sessionState  DataActiveSessionStateEnum value for sessionState.
     * @param  sessionCode  DataActiveSessionCodeEnum value for sessionCode.
     * @param  sessionMessage  String value for sessionMessage.
     */

    protected DataActive(UUID id, String userId, String emaId, String evseId,
            LocalDateTime startedAt, OptionalNullable<LocalDateTime> stoppedAt,
            DataActiveSessionStateEnum sessionState,
            OptionalNullable<DataActiveSessionCodeEnum> sessionCode,
            OptionalNullable<String> sessionMessage) {
        this.id = id;
        this.userId = userId;
        this.emaId = emaId;
        this.evseId = evseId;
        this.startedAt = startedAt;
        this.stoppedAt = stoppedAt;
        this.sessionState = sessionState;
        this.sessionCode = sessionCode;
        this.sessionMessage = sessionMessage;
    }

    /**
     * Getter for Id.
     * Id of the session
     * @return Returns the UUID
     */
    @JsonGetter("Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Id of the session
     * @param id Value for UUID
     */
    @JsonSetter("Id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for UserId.
     * Id of the user that started the session
     * @return Returns the String
     */
    @JsonGetter("UserId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserId() {
        return userId;
    }

    /**
     * Setter for UserId.
     * Id of the user that started the session
     * @param userId Value for String
     */
    @JsonSetter("UserId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter for EmaId.
     * Id of the evse that the user is charging
     * @return Returns the String
     */
    @JsonGetter("EmaId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmaId() {
        return emaId;
    }

    /**
     * Setter for EmaId.
     * Id of the evse that the user is charging
     * @param emaId Value for String
     */
    @JsonSetter("EmaId")
    public void setEmaId(String emaId) {
        this.emaId = emaId;
    }

    /**
     * Getter for EvseId.
     * Electric Vehicle Supply Equipment Identifier. An EVSEID identifies a Charging Point.
     * @return Returns the String
     */
    @JsonGetter("EvseId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEvseId() {
        return evseId;
    }

    /**
     * Setter for EvseId.
     * Electric Vehicle Supply Equipment Identifier. An EVSEID identifies a Charging Point.
     * @param evseId Value for String
     */
    @JsonSetter("EvseId")
    public void setEvseId(String evseId) {
        this.evseId = evseId;
    }

    /**
     * Getter for StartedAt.
     * When the session is started
     * @return Returns the LocalDateTime
     */
    @JsonGetter("StartedAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * Setter for StartedAt.
     * When the session is started
     * @param startedAt Value for LocalDateTime
     */
    @JsonSetter("StartedAt")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Internal Getter for StoppedAt.
     * When the session is stopped
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("StoppedAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * Getter for StoppedAt.
     * When the session is stopped
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getStoppedAt() {
        return OptionalNullable.getFrom(stoppedAt);
    }

    /**
     * Setter for StoppedAt.
     * When the session is stopped
     * @param stoppedAt Value for LocalDateTime
     */
    @JsonSetter("StoppedAt")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStoppedAt(LocalDateTime stoppedAt) {
        this.stoppedAt = OptionalNullable.of(stoppedAt);
    }

    /**
     * UnSetter for StoppedAt.
     * When the session is stopped
     */
    public void unsetStoppedAt() {
        stoppedAt = null;
    }

    /**
     * Getter for SessionState.
     * Describes the session state
     * @return Returns the DataActiveSessionStateEnum
     */
    @JsonGetter("SessionState")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DataActiveSessionStateEnum getSessionState() {
        return sessionState;
    }

    /**
     * Setter for SessionState.
     * Describes the session state
     * @param sessionState Value for DataActiveSessionStateEnum
     */
    @JsonSetter("SessionState")
    public void setSessionState(DataActiveSessionStateEnum sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * Internal Getter for SessionCode.
     * Session code e.g InternalError
     * @return Returns the Internal DataActiveSessionCodeEnum
     */
    @JsonGetter("SessionCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<DataActiveSessionCodeEnum> internalGetSessionCode() {
        return this.sessionCode;
    }

    /**
     * Getter for SessionCode.
     * Session code e.g InternalError
     * @return Returns the DataActiveSessionCodeEnum
     */
    public DataActiveSessionCodeEnum getSessionCode() {
        return OptionalNullable.getFrom(sessionCode);
    }

    /**
     * Setter for SessionCode.
     * Session code e.g InternalError
     * @param sessionCode Value for DataActiveSessionCodeEnum
     */
    @JsonSetter("SessionCode")
    public void setSessionCode(DataActiveSessionCodeEnum sessionCode) {
        this.sessionCode = OptionalNullable.of(sessionCode);
    }

    /**
     * UnSetter for SessionCode.
     * Session code e.g InternalError
     */
    public void unsetSessionCode() {
        sessionCode = null;
    }

    /**
     * Internal Getter for SessionMessage.
     * Session message
     * @return Returns the Internal String
     */
    @JsonGetter("SessionMessage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSessionMessage() {
        return this.sessionMessage;
    }

    /**
     * Getter for SessionMessage.
     * Session message
     * @return Returns the String
     */
    public String getSessionMessage() {
        return OptionalNullable.getFrom(sessionMessage);
    }

    /**
     * Setter for SessionMessage.
     * Session message
     * @param sessionMessage Value for String
     */
    @JsonSetter("SessionMessage")
    public void setSessionMessage(String sessionMessage) {
        this.sessionMessage = OptionalNullable.of(sessionMessage);
    }

    /**
     * UnSetter for SessionMessage.
     * Session message
     */
    public void unsetSessionMessage() {
        sessionMessage = null;
    }

    /**
     * Converts this DataActive into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DataActive [" + "id=" + id + ", userId=" + userId + ", emaId=" + emaId + ", evseId="
                + evseId + ", startedAt=" + startedAt + ", stoppedAt=" + stoppedAt
                + ", sessionState=" + sessionState + ", sessionCode=" + sessionCode
                + ", sessionMessage=" + sessionMessage + "]";
    }

    /**
     * Builds a new {@link DataActive.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DataActive.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .userId(getUserId())
                .emaId(getEmaId())
                .evseId(getEvseId())
                .startedAt(getStartedAt())
                .sessionState(getSessionState());
        builder.stoppedAt = internalGetStoppedAt();
        builder.sessionCode = internalGetSessionCode();
        builder.sessionMessage = internalGetSessionMessage();
        return builder;
    }

    /**
     * Class to build instances of {@link DataActive}.
     */
    public static class Builder {
        private UUID id;
        private String userId;
        private String emaId;
        private String evseId;
        private LocalDateTime startedAt;
        private OptionalNullable<LocalDateTime> stoppedAt;
        private DataActiveSessionStateEnum sessionState;
        private OptionalNullable<DataActiveSessionCodeEnum> sessionCode;
        private OptionalNullable<String> sessionMessage;



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for userId.
         * @param  userId  String value for userId.
         * @return Builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Setter for emaId.
         * @param  emaId  String value for emaId.
         * @return Builder
         */
        public Builder emaId(String emaId) {
            this.emaId = emaId;
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
         * Setter for startedAt.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @return Builder
         */
        public Builder startedAt(LocalDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Setter for stoppedAt.
         * @param  stoppedAt  LocalDateTime value for stoppedAt.
         * @return Builder
         */
        public Builder stoppedAt(LocalDateTime stoppedAt) {
            this.stoppedAt = OptionalNullable.of(stoppedAt);
            return this;
        }

        /**
         * UnSetter for stoppedAt.
         * @return Builder
         */
        public Builder unsetStoppedAt() {
            stoppedAt = null;
            return this;
        }

        /**
         * Setter for sessionState.
         * @param  sessionState  DataActiveSessionStateEnum value for sessionState.
         * @return Builder
         */
        public Builder sessionState(DataActiveSessionStateEnum sessionState) {
            this.sessionState = sessionState;
            return this;
        }

        /**
         * Setter for sessionCode.
         * @param  sessionCode  DataActiveSessionCodeEnum value for sessionCode.
         * @return Builder
         */
        public Builder sessionCode(DataActiveSessionCodeEnum sessionCode) {
            this.sessionCode = OptionalNullable.of(sessionCode);
            return this;
        }

        /**
         * UnSetter for sessionCode.
         * @return Builder
         */
        public Builder unsetSessionCode() {
            sessionCode = null;
            return this;
        }

        /**
         * Setter for sessionMessage.
         * @param  sessionMessage  String value for sessionMessage.
         * @return Builder
         */
        public Builder sessionMessage(String sessionMessage) {
            this.sessionMessage = OptionalNullable.of(sessionMessage);
            return this;
        }

        /**
         * UnSetter for sessionMessage.
         * @return Builder
         */
        public Builder unsetSessionMessage() {
            sessionMessage = null;
            return this;
        }

        /**
         * Builds a new {@link DataActive} object using the set fields.
         * @return {@link DataActive}
         */
        public DataActive build() {
            return new DataActive(id, userId, emaId, evseId, startedAt, stoppedAt, sessionState,
                    sessionCode, sessionMessage);
        }
    }
}
