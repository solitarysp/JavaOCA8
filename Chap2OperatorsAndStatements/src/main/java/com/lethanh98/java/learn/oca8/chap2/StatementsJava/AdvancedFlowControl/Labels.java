package com.lethanh98.java.learn.oca8.chap2.StatementsJava.AdvancedFlowControl;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Các vòng lặp cũng có thể chứa các vòng lặp khác.
 */
public class Labels implements Operators {
    public static void main(String[] args) {
        Operators operators = new Labels();
        operators.run();
    }

    @Override
    public void run() {
        example1();
    }

    private void example1() {
        OUTER_LOOP:
        for (int i = 0; i < 1; i++) {
            log.info("i {}", i);
            INNER_LOOP:
            for (int j = 0; j < 1; j++) {
                log.info("j {}", j);
                break OUTER_LOOP;
            }
        }
    }

}
