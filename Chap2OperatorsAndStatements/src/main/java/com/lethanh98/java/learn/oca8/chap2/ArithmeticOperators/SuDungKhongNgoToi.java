package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SuDungKhongNgoToi implements Operators {
    public static void main(String[] args) {
        Operators operators = new SuDungKhongNgoToi();
        operators.run();
    }

    @Override
    public void run() {
        short a = 1;
        byte b = 1;
        int c = 1;
        char d = '1'; // Decimal == 49
        log.info("{}", a + b + c + d);
        char f = '2'; // Decimal == 50
        log.info("{}", d + f);
    }
}
