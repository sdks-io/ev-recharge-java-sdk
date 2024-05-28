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
 * GetMarkersListConnectorTypesEnum to be used.
 */
public enum GetMarkersListConnectorTypesEnum {
    AVCON,

    DOMESTIC,

    INDUSTRIAL2PDC,

    INDUSTRIALPNEAC,

    INDUSTRIAL3PEAC,

    INDUSTRIAL3PENAC,

    TYPE1,

    TYPE1COMBO,

    TYPE2,

    TYPE2COMBO,

    TYPE3,

    LPI,

    NEMA520,

    SAEJ1772,

    SPI,

    TEPCOCHADEMO,

    TESLA,

    UNSPECIFIED;


    private static TreeMap<String, GetMarkersListConnectorTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        AVCON.value = "Avcon";
        DOMESTIC.value = "Domestic";
        INDUSTRIAL2PDC.value = "Industrial2PDc";
        INDUSTRIALPNEAC.value = "IndustrialPneAc";
        INDUSTRIAL3PEAC.value = "Industrial3PEAc";
        INDUSTRIAL3PENAC.value = "Industrial3PENAc";
        TYPE1.value = "Type1";
        TYPE1COMBO.value = "Type1Combo";
        TYPE2.value = "Type2";
        TYPE2COMBO.value = "Type2Combo";
        TYPE3.value = "Type3";
        LPI.value = "LPI";
        NEMA520.value = "Nema520";
        SAEJ1772.value = "SAEJ1772";
        SPI.value = "SPI";
        TEPCOCHADEMO.value = "TepcoCHAdeMO";
        TESLA.value = "Tesla";
        UNSPECIFIED.value = "Unspecified";

        valueMap.put("Avcon", AVCON);
        valueMap.put("Domestic", DOMESTIC);
        valueMap.put("Industrial2PDc", INDUSTRIAL2PDC);
        valueMap.put("IndustrialPneAc", INDUSTRIALPNEAC);
        valueMap.put("Industrial3PEAc", INDUSTRIAL3PEAC);
        valueMap.put("Industrial3PENAc", INDUSTRIAL3PENAC);
        valueMap.put("Type1", TYPE1);
        valueMap.put("Type1Combo", TYPE1COMBO);
        valueMap.put("Type2", TYPE2);
        valueMap.put("Type2Combo", TYPE2COMBO);
        valueMap.put("Type3", TYPE3);
        valueMap.put("LPI", LPI);
        valueMap.put("Nema520", NEMA520);
        valueMap.put("SAEJ1772", SAEJ1772);
        valueMap.put("SPI", SPI);
        valueMap.put("TepcoCHAdeMO", TEPCOCHADEMO);
        valueMap.put("Tesla", TESLA);
        valueMap.put("Unspecified", UNSPECIFIED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GetMarkersListConnectorTypesEnum constructFromString(String toConvert) throws IOException {
        GetMarkersListConnectorTypesEnum enumValue = fromString(toConvert);
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
    public static GetMarkersListConnectorTypesEnum fromString(String toConvert) {
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
     * Convert list of GetMarkersListConnectorTypesEnum values to list of string values.
     * @param toConvert The list of GetMarkersListConnectorTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GetMarkersListConnectorTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GetMarkersListConnectorTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 