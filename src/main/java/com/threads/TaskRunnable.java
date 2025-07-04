package com.threads;

public class TaskRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed");
    }

    public static void main(String[] args) {
        TaskRunnable task = new TaskRunnable();
        Thread thread = new Thread(task);
        thread.start();
    }
}
