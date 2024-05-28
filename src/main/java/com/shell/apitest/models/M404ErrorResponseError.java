/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.Map;

/**
 * This is a model class for M404ErrorResponseError type.
 */
public class M404ErrorResponseError {
    private String code;
    private String title;
    private String detail;
    private OptionalNullable<Map<String, String>> additionalInfo;

    /**
     * Default constructor.
     */
    public M404ErrorResponseError() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  title  String value for title.
     * @param  detail  String value for detail.
     * @param  additionalInfo  Map of String, value for additionalInfo.
     */
    public M404ErrorResponseError(
            String code,
            String title,
            String detail,
            Map<String, String> additionalInfo) {
        this.code = code;
        this.title = title;
        this.detail = detail;
        this.additionalInfo = OptionalNullable.of(additionalInfo);
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  title  String value for title.
     * @param  detail  String value for detail.
     * @param  additionalInfo  Map of String, value for additionalInfo.
     */

    protected M404ErrorResponseError(String code, String title, String detail,
            OptionalNullable<Map<String, String>> additionalInfo) {
        this.code = code;
        this.title = title;
        this.detail = detail;
        this.additionalInfo = additionalInfo;
    }

    /**
     * Getter for Code.
     * Error code that logically best represents the error encountered
     * @return Returns the String
     */
    @JsonGetter("Code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Error code that logically best represents the error encountered
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Title.
     * Description of the error type
     * @return Returns the String
     */
    @JsonGetter("Title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * Description of the error type
     * @param title Value for String
     */
    @JsonSetter("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Detail.
     * Details of the error that can help under the cause of the error
     * @return Returns the String
     */
    @JsonGetter("Detail")
    public String getDetail() {
        return detail;
    }

    /**
     * Setter for Detail.
     * Details of the error that can help under the cause of the error
     * @param detail Value for String
     */
    @JsonSetter("Detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Internal Getter for AdditionalInfo.
     * @return Returns the Internal Map of String, String
     */
    @JsonGetter("AdditionalInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Map<String, String>> internalGetAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Getter for AdditionalInfo.
     * @return Returns the Map of String, String
     */
    public Map<String, String> getAdditionalInfo() {
        return OptionalNullable.getFrom(additionalInfo);
    }

    /**
     * Setter for AdditionalInfo.
     * @param additionalInfo Value for Map of String, String
     */
    @JsonSetter("AdditionalInfo")
    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = OptionalNullable.of(additionalInfo);
    }

    /**
     * UnSetter for AdditionalInfo.
     */
    public void unsetAdditionalInfo() {
        additionalInfo = null;
    }

    /**
     * Converts this M404ErrorResponseError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M404ErrorResponseError [" + "code=" + code + ", title=" + title + ", detail="
                + detail + ", additionalInfo=" + additionalInfo + "]";
    }

    /**
     * Builds a new {@link M404ErrorResponseError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M404ErrorResponseError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, title, detail);
        builder.additionalInfo = internalGetAdditionalInfo();
        return builder;
    }

    /**
     * Class to build instances of {@link M404ErrorResponseError}.
     */
    public static class Builder {
        private String code;
        private String title;
        private String detail;
        private OptionalNullable<Map<String, String>> additionalInfo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  String value for code.
         * @param  title  String value for title.
         * @param  detail  String value for detail.
         */
        public Builder(String code, String title, String detail) {
            this.code = code;
            this.title = title;
            this.detail = detail;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for detail.
         * @param  detail  String value for detail.
         * @return Builder
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Setter for additionalInfo.
         * @param  additionalInfo  Map of String, value for additionalInfo.
         * @return Builder
         */
        public Builder additionalInfo(Map<String, String> additionalInfo) {
            this.additionalInfo = OptionalNullable.of(additionalInfo);
            return this;
        }

        /**
         * UnSetter for additionalInfo.
         * @return Builder
         */
        public Builder unsetAdditionalInfo() {
            additionalInfo = null;
            return this;
        }

        /**
         * Builds a new {@link M404ErrorResponseError} object using the set fields.
         * @return {@link M404ErrorResponseError}
         */
        public M404ErrorResponseError build() {
            return new M404ErrorResponseError(code, title, detail, additionalInfo);
        }
    }
}
