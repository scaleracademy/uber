package com.uber.api.exceptions;

public class NoSuchUserException extends UberAPIException {
    public NoSuchUserException(String message) {
        super(message);
    }
}

// exceptions you throw should be specific
// your exceptions should be cachtable in a generic manner

