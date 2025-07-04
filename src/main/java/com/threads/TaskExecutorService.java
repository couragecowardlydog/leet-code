package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutorService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ": Started");
                try {
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ": Completed");
            }));
        }
        executorService.shutdown();
    }
}
