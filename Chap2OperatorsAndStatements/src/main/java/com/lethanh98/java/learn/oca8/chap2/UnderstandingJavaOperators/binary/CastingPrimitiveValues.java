package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.3
 */
public class CastingPrimitiveValues implements Operators {
    public static void main(String[] args) {
        Operators operators = new CastingPrimitiveValues();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        OverflowAndUnderflow();
    }

    private void example2() {
        int a = 1;
        long b = a;
    }

    private void OverflowAndUnderflow() {
        /**
         * Một Overflow xẩy ra khi giá trị chúng ta casting, + data...etc..
         * quá lớn só với dung lượng của data type nó khiến dữ liệu không còn năm trong datatype nữa
         */
        short a = (short) 1921222;  // Stored as 20678
        log.info("a: {}", a);

        /**
         * Một Underflow xẩy ra Khi 1 giá trị quá nhỏ só với data có thể lưu được
         */
        short b = (short) -1921222;  // Stored as -20678

        log.info("b: {}", b);
        log.info("=====================End example2 =====================");

    }

    private void example1() {
        int x = (int) 1.0;
        short y = (short) 1921222;  // Stored as 20678
        int z = (int) 9l;
        long t = 192301398193810323L;
        log.info("int x {} , short y {} , z {}, t {}", x, y, z, t);
        log.info("=====================End example1 =====================");

    }


}
