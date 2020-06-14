package org.restws.model;

public class ErrorMessage {
    private String message;
    private int status;
    public ErrorMessage() {
    }

    public ErrorMessage(String message, int status) {
        super();
        this.message = message;
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

}
