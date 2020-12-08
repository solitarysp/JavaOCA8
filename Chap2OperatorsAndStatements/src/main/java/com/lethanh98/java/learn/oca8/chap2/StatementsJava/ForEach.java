package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;


@Slf4j

public class ForEach implements Operators {
    public static void main(String[] args) {
        Operators operators = new ForEach();
        operators.run();
    }

    @Override
    public void run() {
        example3();
        example4(Arrays.asList("1", "2"));
        example5();
    }


    private void example3() {
        log.info("=====================example3==================");
        String[] names = new String[2];
        for (String name : names) {
            log.info("{}", name);
        }

    }

    private void example4(List<String> strings) {
        log.info("=====================example4==================");
        for (String s : strings) {
            log.info("{}", s);
        }
    }

    private void example5() {
        log.info("=====================example5==================");
        int a = 1;
        for (; a < 3; ) {
            log.info("a < 3 : a is {}", a);
            a++;
        }

    }

    private void example6() {
        log.info("=====================example6==================");
        // chạy vô tận
        for (; ; ) {
            log.info("example5");
        }
    }

}
