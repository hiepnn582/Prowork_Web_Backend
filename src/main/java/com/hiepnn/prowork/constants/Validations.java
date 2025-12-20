package com.hiepnn.prowork.constants;

public class Validations {
    //region Number
    public static final int MIN_USERNAME_CHARACTERS = 4;
    public static final int MAX_USERNAME_CHARACTERS = 100;
    public static final int MIN_PASSWORD_CHARACTERS = 8;
    public static final int MAX_PASSWORD_CHARACTERS = 50;
    //endregion

    //region Regex
    public static final String REGEX_PASSWORD_RULES = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+={}\\[\\]|\\\\:;\"'<,>.?/]).*$";
    //endregion

    //region Message
    public static final String PASSWORD_RULES = "Password must contain at least 1 uppercase letter, 1 lowercase letter, 1 number and 1 special character";
    public static final String CONFIRM_PASSWORD_RULES = "Confirm password does not match the entered password";

    public static String required(String fieldName) {
        return fieldName + " is required";
    }

    public static String maxCharacters(String fieldName, int numberCharacters) {
        return fieldName + " cannot exceed " + numberCharacters + " characters";
    }

    public static String minCharacters(String fieldName, int numberCharacters) {
        return fieldName + " must contain at least " + numberCharacters + " characters";
    }
    //endregion
}
