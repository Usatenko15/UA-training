package com.company.model.entity;

public class NotUniqueLoginException extends Exception {
    private String userNameData;

    public String getUserNameData() {
        return userNameData;
    }

    public NotUniqueLoginException (String message, String userNameData) {
        super(message);
        this.userNameData = userNameData;
    }
}
