package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j

public class Switch implements Operators {
    public static void main(String[] args) {
        Operators operators = new Switch();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example3();
        example5();
        example6UsingFallThrough();
        exampleStringSwitchDemo();
    }


    // Sẽ hiển thị Default và 2. Bởi vì đến case default hệ thống sẽ thực hiện các code ở các case tiếp theo cho đến khi gặp break
    private void example1() {
        log.info("==================example1============");
        switch (5) {
            case 1: {
                log.info("1");
                break;
            }
            default: {
                log.info("Default");
            }
            case 2: {
                log.info("2");
            }
        }
    }

    //example2 sẽ lỗi compiler vì có 2 biến result được tạo. Khi case không có {} thì scope của nó sẽ ở scope của switch.
//    private void example2() {
//        log.info("==================example2============");
//        switch (5) {
//            case 1:
//                String result = "1";
//                log.info("1");
//                break;
//            case 2:
//                String result = "1";
//                log.info("2");
//                break;
//        }
//    }
    // Example 3 chạy bình thường vì result ở các scope khác nhau
    private void example3() {
        log.info("==================example3============");
        switch (1) {
            case 1: {
                String result = "1";
                log.info("1");
                break;
            }
            case 2: {
                String result = "1";
                log.info("2");
                break;
            }

        }
    }
// Không chạy được vì dataForCase không phải là một constant
//    private void example4(int number) {
//        log.info("==================example4============");
//        int dataForCase= 1;
//        switch (getData(number)) {
//            case 1: {
//                String result="1";
//                log.info("1");
//                break;
//            }
//            case dataForCase: {
//                String result="1";
//                log.info("2");
//                break;
//            }
//
//        }
//    }

    private void example5() {
        log.info("==================example5============");
        switch (1) {
            case '1': {
                log.info("1");
                break;
            }
            case 2: {
                log.info("2");
                break;
            }
        }
    }

    private void example6UsingFallThrough() {
        log.info("====================================example6UsingFallThrough==================================");
        int month = 9;
        switch (month) {
            case 1:
                log.info("January");
            case 2:
                log.info("February");
            case 3:
                log.info("March");
            case 4:
                log.info("April");
            case 5:
                log.info("May");
            case 6:
                log.info("June");
            case 7:
                log.info("July");
            case 8:
                log.info("August");
            case 9:
                log.info("September");
            case 10:
                log.info("October");
            case 11:
                log.info("November");
            case 12:
                log.info("December");
                break;
            default:
                break;
        }
    }

    // Bắt đầu từ java 7, chúng ta có thể String  trong switch
    private void exampleStringSwitchDemo() {
        log.info("====================================exampleStringSwitchDemo==================================");
        String name = "thanh";
        switch (name) {
            case "thanh":
                log.info("thanh");
                break;
            case "tuan":
                log.info("tuan");
                break;
        }
    }
}
