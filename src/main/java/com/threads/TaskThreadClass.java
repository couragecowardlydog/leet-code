package com.threads;

public class TaskThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Task started");
    }

    public static void main(String[] args) {
        TaskThreadClass task = new TaskThreadClass();
        task.start();
    }

}
