package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TraiQuaPhai implements Operators {
    public static void main(String[] args) {
        Operators operators = new TraiQuaPhai();
        operators.run();
    }

    @Override
    public void run() {
        int x = 1 + 1 + 1 + 1 + 1 - 9;
        log.info("Từ trái qua phải: {}", x);
    }
}
