/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * TariffVOUpdatedByEnum to be used.
 */
public enum TariffVOUpdatedByEnum {
    FEED,

    ADMIN,

    TARIFFSERVICE,

    DEFAULTS;


    private static TreeMap<String, TariffVOUpdatedByEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        FEED.value = "Feed";
        ADMIN.value = "Admin";
        TARIFFSERVICE.value = "TariffService";
        DEFAULTS.value = "Defaults";

        valueMap.put("Feed", FEED);
        valueMap.put("Admin", ADMIN);
        valueMap.put("TariffService", TARIFFSERVICE);
        valueMap.put("Defaults", DEFAULTS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TariffVOUpdatedByEnum constructFromString(String toConvert) throws IOException {
        TariffVOUpdatedByEnum enumValue = fromString(toConvert);
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
    public static TariffVOUpdatedByEnum fromString(String toConvert) {
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
     * Convert list of TariffVOUpdatedByEnum values to list of string values.
     * @param toConvert The list of TariffVOUpdatedByEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TariffVOUpdatedByEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TariffVOUpdatedByEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 