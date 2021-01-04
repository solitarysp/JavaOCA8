package com.lethanh98.java.learn.oca8.chap4.DesigningMethods.ReturnType;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")

public class Test2Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Test2Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        $example();
        _example();
    }

    private long $example() {
        log.info(BASE_LOG, "$example");

        int a = 1;
        return a;
    }

    private long _example() {
        log.info(BASE_LOG, "_example");

        int a = 1;
        return a;
    }

}
