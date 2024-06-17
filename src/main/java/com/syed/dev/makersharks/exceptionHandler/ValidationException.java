package com.syed.dev.makersharks.exceptionHandler;

public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super(message);
    }
}
