package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class CompoundAssignmentOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new CompoundAssignmentOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        exampleAutoCase();
    }

    private void exampleAutoCase() {
        log.info("====================exampleAutoCase=================");
        int a = 1;
        float b = 1.0f;
        a += b;
        log.info("{}", a);

    }

    private void example1() {
        log.info("====================example1=================");
        int a = 1;
        a += 1;
        log.info("{}", a);
        long x = 5;
        long y = x=3;
        log.info("{}", y);

    }

}
