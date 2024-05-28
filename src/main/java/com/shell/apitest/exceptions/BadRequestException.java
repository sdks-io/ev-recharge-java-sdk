/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for BadRequestException type.
 */
public class BadRequestException extends ApiException {
    private static final long serialVersionUID = 4998300159501454482L;
    private String code;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public BadRequestException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Code.
     * Error code
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * Error code
     * @param code Value for String
     */
    @JsonSetter("code")
    private void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * Error desctiption in English
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Error desctiption in English
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }
}
