package com.leetcode;

import com.leetcode.tsc.*;


/**
 * @author vivekanandan.sakthiv on Apr 2021
 */


public class Client {

    public static void main(String[] args) {

        AbstractNotificationReceiver onNotificationReceived = new TableSettingNotificationProcessor();
        EntityA entityA = new EntityA();
        entityA.setParam(1);
        entityA.setParentMemberId("Parent");
        onNotificationReceived.onNotificationReceived(entityA);
        AlertMessage alertMessage = (AlertMessage) onNotificationReceived;
        System.out.println(onNotificationReceived instanceof SMSNotification);
        System.out.println(alertMessage instanceof AlertMessage);


    }
}
