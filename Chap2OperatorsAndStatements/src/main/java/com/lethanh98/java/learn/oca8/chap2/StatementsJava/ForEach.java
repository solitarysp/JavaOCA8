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
        example1();
        example2(Arrays.asList("1", "2"));
    }
    private void example1() {
        log.info("=====================example1==================");
        String[] names = new String[2];
        for (String name : names) {
            log.info("Log");
        }
    }

    private void example2(List<String> strings) {
        log.info("=====================example2==================");
        for (String s : strings) {
            log.info("{}", s);
        }
    }
}
