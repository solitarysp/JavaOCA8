package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

/**
 * Toán tử Minus(-) là toán tử được sử dụng để chuyển đổi giá trị từ âm thành dương hoặc từ dương thành âm.
 * ĐƠn giản hơn là nó sẽ chuyển đổi đối ngược với giá trị hiện tại
 */
public class UnaryOperatorsMinus implements UnaryOperators {
    public static void main(String[] args) {
        UnaryOperators unaryOperators = new UnaryOperatorsMinus();
        unaryOperators.run();
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
