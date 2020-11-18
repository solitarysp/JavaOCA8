package com.lethanh98.java.learn.oca8.chap1.finalize;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FinalizeExample {
    static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 500000, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(500));
    static final ThreadPoolExecutor threadPoolExecutorGC = new ThreadPoolExecutor(5, 500000, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(500));

    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            threadPoolExecutor.execute(() -> new UserFinalize());
        }
    }
}
