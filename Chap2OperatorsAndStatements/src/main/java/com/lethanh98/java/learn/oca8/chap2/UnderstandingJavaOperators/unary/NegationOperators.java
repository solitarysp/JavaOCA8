package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

/**
 * Toán tử ‘NOT’ Operator(!) được sử dụng để đạo ngược lại giá trị true hoặc flase. Nếu giá trị là true thì sẽ đảo ngược là false, Nêu là false thì sẽ là true
 * !(operand)
 * Chỉ có tác dụng với boolean
 */
@Slf4j
public class NegationOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new NegationOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }

    private void example2() {
        boolean isOk = true;
        log.info("!isOk: {}", !isOk);
        boolean isOk2 = !false;
        log.info("isOk2: {}", isOk2);
    }

    private void example1() {
        boolean isDepZai = false;
        log.info("isDepZai: {}", isDepZai);
        isDepZai = !isDepZai;
        log.info("isDepZai phủ định: {}", isDepZai);
    }

}
