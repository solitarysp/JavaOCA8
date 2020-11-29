package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToanTuDu implements Operators {
    public static void main(String[] args) {
        Operators operators = new ToanTuDu();
        operators.run();
    }

    @Override
    public void run() {
        int x = 10 % 5;
        int b = 10 % 4 * 2 ; //
        int c = 5 + 10 % 5;
        int d = -11 % 3;
        log.info("10 % 5 = {}",x);
        log.info(" 10 % 4 * 2 = {}",b);
        log.info("5 + 10 % 5 = {}",c); 
        log.info("-11 % 3",d); // = 2 bởi vì 11 % 3 dư 2. Ngược lại = -2
    }
}
