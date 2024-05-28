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
 * GetNearbyLocationsAuthorizationMethodsEnum to be used.
 */
public enum GetNearbyLocationsAuthorizationMethodsEnum {
    NEWMOTIONAPP,

    RFIDTOKEN,

    PNC;


    private static TreeMap<String, GetNearbyLocationsAuthorizationMethodsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NEWMOTIONAPP.value = "NewMotionApp";
        RFIDTOKEN.value = "RFIDToken";
        PNC.value = "PnC";

        valueMap.put("NewMotionApp", NEWMOTIONAPP);
        valueMap.put("RFIDToken", RFIDTOKEN);
        valueMap.put("PnC", PNC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GetNearbyLocationsAuthorizationMethodsEnum constructFromString(String toConvert) throws IOException {
        GetNearbyLocationsAuthorizationMethodsEnum enumValue = fromString(toConvert);
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
    public static GetNearbyLocationsAuthorizationMethodsEnum fromString(String toConvert) {
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
     * Convert list of GetNearbyLocationsAuthorizationMethodsEnum values to list of string values.
     * @param toConvert The list of GetNearbyLocationsAuthorizationMethodsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GetNearbyLocationsAuthorizationMethodsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GetNearbyLocationsAuthorizationMethodsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 