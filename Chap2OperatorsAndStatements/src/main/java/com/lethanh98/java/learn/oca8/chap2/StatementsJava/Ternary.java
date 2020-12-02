package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j

public class Ternary implements Operators {
    public static void main(String[] args) {
        Operators operators = new Ternary();
        operators.run();
    }

    @Override
    public void run() {
        example1(9);
        example2();
    }

    private void example2() {
        int number=1;
        boolean result = cal(number++) & cal(number++) ? true : false;
        log.info("{}, and {}", result,number);
    }

    private boolean cal(int number) {
        return number>1;
    }

    private void example1(int number) {
        log.info("{}", (number > 5) ? 21 : "Zebra");

    }

}
