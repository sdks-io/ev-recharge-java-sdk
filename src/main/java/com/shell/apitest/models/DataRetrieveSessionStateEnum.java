/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * DataRetrieveSessionStateEnum to be used.
 */
public enum DataRetrieveSessionStateEnum {
    STARTED,

    STOPPED,

    STARTREQUESTED,

    STOPREQUESTED,

    FAILEDTOSTART,

    FAILEDTOSTOP;


    private static TreeMap<String, DataRetrieveSessionStateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        STARTED.value = "started";
        STOPPED.value = "stopped";
        STARTREQUESTED.value = "start-requested";
        STOPREQUESTED.value = "stop-requested";
        FAILEDTOSTART.value = "failed-to-start";
        FAILEDTOSTOP.value = "failed-to-stop";

        valueMap.put("started", STARTED);
        valueMap.put("stopped", STOPPED);
        valueMap.put("start-requested", STARTREQUESTED);
        valueMap.put("stop-requested", STOPREQUESTED);
        valueMap.put("failed-to-start", FAILEDTOSTART);
        valueMap.put("failed-to-stop", FAILEDTOSTOP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DataRetrieveSessionStateEnum constructFromString(String toConvert) throws IOException {
        DataRetrieveSessionStateEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static DataRetrieveSessionStateEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of DataRetrieveSessionStateEnum values to list of string values.
     * @param toConvert The list of DataRetrieveSessionStateEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DataRetrieveSessionStateEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DataRetrieveSessionStateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 