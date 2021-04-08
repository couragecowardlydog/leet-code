package com.leetcode.notification;


/**
 * @author vivekanandan.sakthiv on Mar 2021
 */


public class AlertNotification<T> extends Notification {

    private String title;

    private String category;

    private T oneappPayload;

    private String type = "alert";

    private String vin;

    private String status;

    private String remoteCommandType;


}
