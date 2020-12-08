package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j

public class For implements Operators {
    public static void main(String[] args) {
        Operators operators = new For();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }

    private void example1() {
        log.info("=====================example1==================");
        for (StringBuilder i = new StringBuilder(); i.indexOf("end") < 0; ) {
            log.info("vòng lặp chạy");
            i.append("end");
        }
    }

    // khởi tạo nhiều giá trị
    private void example2() {
        log.info("=====================example2==================");
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            log.info("Run");
        }
    }

//    private void example3() {
//        log.info("=====================example3==================");
//        int a = 1;
//        int b = 1;
//        for (int a = 1, b=1; a < 3 && b < 3; a++,b++ ) {
//            log.info("a < 3 && b < 3");
//        }
//    }

//    private void example4() {
//        log.info("=====================example4==================");
//        int a = 1;
//        for ( a = 1,int b = 1; a < 3 && b < 3; a++, b++) {
//            log.info("a < 3 && b < 3");
//        }
//    }

    private void example5() {
        log.info("=====================example5==================");
        // chạy vô tận
        for (; ; ) {
            log.info("example5");
        }
    }

}
