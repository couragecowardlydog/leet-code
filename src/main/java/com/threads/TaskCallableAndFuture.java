package com.threads;

import java.util.concurrent.*;

public class TaskCallableAndFuture implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return (int) Math.random();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Future<Integer> f = executorService.submit(new TaskCallableAndFuture());
        }
    }
}
