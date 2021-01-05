package com.lethanh98.java.learn.oca8.chap4.VarargsAs;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")

public class Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2("thanh");
        example2("thanh", new int[]{1, 2, 3});
        example3(null);
    }

    private void example3(int... number) {
        log.info(BASE_LOG, "example3");
        log.info("{}", number);

    }

    private void example2(String name, int... number) {
        log.info(BASE_LOG, "example2");
        log.info("Name: {}", name);
    }

    private void example(int... number) {
        log.info(BASE_LOG, "example");
        if (number.length <= 0) {
            return;
        }
    }


}
