package com.leetcode.notification;

import java.io.Serializable;


public class Notification implements Serializable {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
