package com.lethanh98.java.learn.oca8.chap2.StatementsJava.AdvancedFlowControl;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Các vòng lặp cũng có thể chứa các vòng lặp khác.
 */
public class NestedLoops implements Operators {
    public static void main(String[] args) {
        Operators operators = new NestedLoops();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }

    private void example1() {
        log.info("========================example1============================");
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                log.info("{}", mySimpleArray[i]);
            }
        }
    }

    private void example2() {
        log.info("========================example2============================");
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            log.info(x + "");
        }
    }


}
