package com.apparelshop.dataretriever.exception;

import org.springframework.http.HttpStatus;

public class NoDataSentException {

    private int statusCode;
    private String message;

    public NoDataSentException() {
        this.message = "No data has been sent.";
        this.statusCode = HttpStatus.BAD_REQUEST.value();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
