package com.hiepnn.prowork.exceptions;

public class DuplicateResourceException extends RuntimeException {
    private final String field;

    public DuplicateResourceException(String field, String message) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return this.field;
    }
}
