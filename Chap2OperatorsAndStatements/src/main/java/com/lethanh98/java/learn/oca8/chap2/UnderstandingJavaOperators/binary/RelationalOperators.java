package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class RelationalOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new RelationalOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }

    private void example2() {
        Operators operators = new RelationalOperators();
        if (operators instanceof RelationalOperators) {
            log.info("đúng operators instanceof RelationalOperators");
        }
    }

    private void example1() {
        log.info("================example1===========");
        int x = 10, y = 10;
        log.info(" x < y  --> {} <  {}: {}", x, y, x < y);
        log.info(" x <= y --> {} <= {}: {}", x, y, x <= y);
        log.info(" x == y --> {} == {}: {}", x, y, x == y);
        log.info(" x > y  --> {} >  {}: {}", x, y, x > y);
        log.info(" x >= y --> {} >= {}: {}", x, y, x >= y);
    }

}
