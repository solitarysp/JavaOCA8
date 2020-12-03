package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class EqualityOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new EqualityOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        exampleWithObject();
        exampleError();
    }

    private void exampleWithObject() {
        log.info("==================exampleWithObject====================");
        String a = "a";
        String b = new String("a");
        log.info("a == b = {}", a == b);// So sánh địa chỉ bộ nhớ
        log.info("a.equals(b) = {}", a.equals(b));// So sánh giá trị bộ nhớ
    }
    private void example1() {

        log.info("===================example1===================");
        if (5 == 5.000000000001f) {
            log.info("5 == 5.000000000001f");
        }
        if (5 == 5.0001f) {
            log.info("5 == 5.0001f");
        }
        if (5 == 5.1) {
            log.info("5 == 5.1");
        }
    }

    private void exampleError() {
        log.info("===============================================exampleError===================");

        //  boolean a = 1 == true;
    }


}
