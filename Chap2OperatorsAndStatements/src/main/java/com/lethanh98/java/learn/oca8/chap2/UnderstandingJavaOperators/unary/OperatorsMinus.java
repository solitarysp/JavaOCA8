package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

/**
 * Toán tử Minus(-)  có 2 tác dụng
 * 1 : sử dụng để khai báo 1 số âm (Không được gọi là unary vì là khai báo chứ k phải Operators)
 * 2: Sử dụng để đảo ngược giá trị từ âm sang dương hoặc từ dương sang âm
 */
@Slf4j
public class OperatorsMinus implements Operators {
    public static void main(String[] args) {
        Operators operators = new OperatorsMinus();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        example3();

    }

    private void example3() {
        int a = 5;// Lỗi vì không thể sử dụng toán tử phủ định của boolean cho số.
    }

    private void example1() {
        int a = -100;// khai báo 1 số âm
        log.info("Khai báo 1 số âm {}",a);
    }

    private void example2() {
        // Âm thành dương
        int a = -10;
        a = -a;
        log.info("âm thành dương: {}", a);
        // Dương thành âm
        int b = 20;
        b = -b;
        log.info("Dương thành âm: {}", b);
    }
}
