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
        example3();
        example4();
    }

    private void example4() {
        log.info("==================example4============");
        int number = 1;
        float a = number > 1 ? 1F : 2L;
    }

    private void example1(int number) {
        log.info("==================example1============");
        int result1 = 1;
        Long result = (number > 5) ? result1 : 10L;
    }

    private void example2() {
        log.info("==================example2============");
        int number = 1;
        boolean result = cal(number++) & cal(number++) ? true : false;
        log.info("{}, and {}", result, number);
    }

    private boolean cal(int number) {
        return number > 1;
    }

    private void example3() {
        log.info("==================example3============");
        int number = 1;
        char a = number > 1 ? '1' : 255;
        //  char b = number > 1 ? 9 : 255;
        log.info("{}", a);
        // log.info("{}",b);
    }


}
