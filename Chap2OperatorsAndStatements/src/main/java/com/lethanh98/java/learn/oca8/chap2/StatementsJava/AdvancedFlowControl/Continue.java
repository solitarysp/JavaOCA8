package com.lethanh98.java.learn.oca8.chap2.StatementsJava.AdvancedFlowControl;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Label được sử dụng để gắn Label cho các Statement trong java. 
 */
public class Continue implements Operators {
    public static void main(String[] args) {
        Operators operators = new Continue();
        operators.run();
    }

    @Override
    public void run() {
        example1();
    }

    private void example1() {
        OUTER_LOOP:
        for (int i = 0; i < 3; i++) {
            log.info("i {}", i);
            INNER_LOOP:
            for (int j = 0; j < 1000; j++) {
                log.info("j {}", j);
                continue ;
            }
        }
    }

}
