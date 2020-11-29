package com.lethanh98.java.learn.oca8.chap2.NumericPromotion;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NumericPromotion implements Operators {
    public static void main(String[] args) {
        Operators operators = new NumericPromotion();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        example3();
        example4();
    }

    private void example4() {
        char a = 'a';
        int b = a + 'b';
        int c = a + 1;
    }

    private void example3() {
        //Các kiểu dữ liệu nhỏ hơn int. Cụ thể là byte, short, char sẽ tự động được chuyển sang int khi chúng được sử dụng với toán tử.
        //Với char sẽ tự động được chuyển sang  decimal
        short a = 1;
        byte b = 1;
        int c = a + b;
        // Thuy nhiên nếu là toán tử 1 ngôi thì được bỏ qua quy tắc này. Java sẽ tự động ép kiểu về giá trị đó
        a = a++;
    }

    private void example2() {
        /**
         * If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type
         */
        long a = 10L;
        float b = 10f;
        float c = b + a; // tự động chuyển dữ liệu đến floating-point  và trả về
    }

    private void example1() {
        //If two values have different data types, Java will automatically promote one of the val-ues to the larger of the two data types
        int a = 2;
        long b = 2;
        long c = a + b; // tự động tăng hạng kiểu dự liệu có giá trị nhỏ hơn
    }
}
