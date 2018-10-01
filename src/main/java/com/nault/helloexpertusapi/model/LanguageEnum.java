package com.nault.helloexpertusapi.model;

/**
 * Enumeration for common language supported by Google Translate with the name and their respective ISO 639-1 codes.
 * Source : https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
 *
 * This enum represents the data in the DB.
 */
public enum LanguageEnum {
    FRENCH("fr"),
    ENGLISH("en"),
    ARABIC("ar"),
    CROATIAN("hr"),
    DUTCH("nl"),
    DANISH("da"),
    FINNISH("fi");

    private String value;

    LanguageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
