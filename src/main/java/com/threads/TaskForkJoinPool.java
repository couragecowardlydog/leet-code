package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TaskForkJoinPool extends RecursiveTask<Integer> {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new TaskForkJoinPool());

    }

    @Override
    protected Integer compute() {
        System.out.println("compute");
        return 0;
    }
}
