package com.genericCrud.genericCrud.modules.exception;

public class SuccessMessageException extends Exception {
    public SuccessMessageException() {
        super();
    }

    public SuccessMessageException(String message) {
        super(message);
    }

    public SuccessMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public SuccessMessageException(Throwable cause) {
        super(cause);
    }

    protected SuccessMessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
