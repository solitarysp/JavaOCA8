package com.lethanh98.java.learn.oca8.chap6.CommonException;

import com.lethanh98.java.learn.oca8.chap6.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ErrorsExeptions implements BaseInterface {
    public static void main(String[] args) throws Exception {
        BaseInterface baseInterface = new ErrorsExeptions();
        baseInterface.run();
    }

    @Override
    public void run() throws Exception {
        try {
            log.info("{}", TestExceptionInInitializerError.name);
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
        }
        new Thread(new TestStackOverflowError()).start();
        Thread.sleep(2000);
    }
}

class TestExceptionInInitializerError {
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static String name = "Thanh";
}

class TestStackOverflowError implements Runnable {
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    @Override
    public void run() {
        doNotCodeThis(1);
    }
}