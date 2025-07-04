package com.threads;

import java.util.concurrent.CompletableFuture;

public class TaskCompletableFuture {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });
        future.whenComplete((result, throwable) -> {
            System.out.println(result);
        });
        future.whenCompleteAsync((result, throwable) -> {
            System.out.println(result);
        });

        future.join();
    }
}
