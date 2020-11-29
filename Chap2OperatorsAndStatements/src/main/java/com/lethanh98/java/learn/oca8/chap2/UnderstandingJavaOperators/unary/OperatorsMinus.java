package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;

/**
 * Toán tử Minus(-) là toán tử được sử dụng để chuyển đổi giá trị từ âm thành dương hoặc từ dương thành âm.
 * ĐƠn giản hơn là nó sẽ chuyển đổi đối ngược với giá trị hiện tại
 */
public class OperatorsMinus implements Operators {
    public static void main(String[] args) {
        Operators operators = new OperatorsMinus();
        operators.run();
    }

    @Override
    public void run() {
        // Âm thành dương
        int a = -10;
        a = -a;
        System.out.println("âm thành dương: " + a);
        // Dương thành âm
        int b = 20;
        b = -b;
        System.out.println("Dương thành âm: " + b);

    }
}
