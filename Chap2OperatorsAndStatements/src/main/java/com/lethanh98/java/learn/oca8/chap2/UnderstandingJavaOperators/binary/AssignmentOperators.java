package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AssignmentOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new AssignmentOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
    }

    private void example1() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        /**
         * 4 * 5 / x-- + --x
         * 20 / 4 + --x  ( vì x-- nên sau khi hết biểu thức này, x sẽ =3 )
         * 5 + 2  ( --x thì = --3 nên x = 2)
         * 7
         */
        log.info("x is " + x);
        log.info("y is " + y);
    }


}
