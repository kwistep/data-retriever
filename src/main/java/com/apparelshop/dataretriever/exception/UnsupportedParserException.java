package com.apparelshop.dataretriever.exception;

import org.springframework.http.HttpStatus;

public class UnsupportedParserException extends Throwable {

    private String message;

    private int statusCode;

    public UnsupportedParserException(String message) {
        this.message = "Parser [" + message + "] is not supported.";
        this.statusCode = HttpStatus.BAD_REQUEST.value();
    }

    public UnsupportedParserException() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
