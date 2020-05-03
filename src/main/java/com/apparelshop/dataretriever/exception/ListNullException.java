package com.apparelshop.dataretriever.exception;

import org.springframework.http.HttpStatus;

public class ListNullException extends Throwable {

    private int statusCode;
    private String message;

    public ListNullException(String links) {
        this.message = "The list [" + links + "] does not exist.";
        this.statusCode = HttpStatus.BAD_REQUEST.value();
    }

    public ListNullException() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
