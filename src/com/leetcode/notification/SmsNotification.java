package com.leetcode.notification;


import java.math.BigDecimal;

/**
 * @author vivekanandan.sakthiv on Mar 2021
 */

public class SmsNotification extends Notification {

    private BigDecimal phoneNumber;

    public BigDecimal getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigDecimal phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
