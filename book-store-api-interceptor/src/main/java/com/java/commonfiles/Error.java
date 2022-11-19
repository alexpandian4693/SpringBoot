package com.java.commonfiles;

public class Error {

    private String target;
    private String message;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error(String target, String message) {
        this.target = target;
        this.message = message;
    }
}
