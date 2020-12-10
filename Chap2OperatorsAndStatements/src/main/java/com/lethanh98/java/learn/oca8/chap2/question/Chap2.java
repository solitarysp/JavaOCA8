package com.lethanh98.java.learn.oca8.chap2.question;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Chap2 implements Operators {
    public static void main(String[] args) {
        Operators operators = new Chap2();
        operators.run();
    }

    @Override
    public void run() {
        question17();
        question19();
        question20();
        question21();
        question22();
    }

    /**
     * Vì Assignment multil Vaule sẽ theo thứ tự từ trái qua phải, vì vậy khi đó b sẽ chưa được khởi tạo
     * Ví dụ ở dưới flow sẽ là
     * Step 1 : Set A = b
     * Step 2 : Set b = 4
     * Vì step 1 chưa có b nên sẽ lỗi
     */
//    private void question16() {
//        int a = b, b = 4;
//        log.info("{} and {}", a, b);
//    }

    /**
     * Việc gắn lồng sẽ chạy từ phải qua trái
     * Step :
     * Step 1 :Gắn a = 2
     * Step 2 :Gắn b = a
     */
    private void question17() {
        int a = 1;
        int b = a = 2;
        log.info("{} and {}", a, b);
    }

    /**
     * Việc gắn lồng sẽ chạy từ phải qua trái vì vậy chúng ta không thể gắn 1 giá trị với 1 biến
     */
//    private void question18() {
//        int a = 1;
//        int b = a = 2;
//        int c = 3 = b;
//        log.info("{} and {} and {}", a, b, c);
//    }

    /**
     *
     */
    private void question19() {
        int a = (int) 1000.0000000000000000000000000000000000000000000001f;
        long b = (long) 100000000000000000000000000000000000000000000.000000000000000000000000000000000001d;
        log.info("{}", a);
    }

    private void question20() {
        int number = 5;
        if (number > 6 && number < 10) ;
        log.info("number > 2 and");
        log.info("number < 10");

        log.info("Done question20");
    }

    private void question21() {
        int today = 5;
        switch (today) {
            default: {
                log.info("not in 2 or 3");
            }
            case 2: {
                String day = "2";
                log.info("{}", day);
                break;
            }
            case 3:
                String day = "3";
                log.info("{}", day);
                break;
        }
    }

    private void question22(final int d) {
        final char a = '1';
        final int b = 2;
        int c = 3;

switchCaseQuestion22: switch (1) {
            case a: {
                break;
            }
            case b: {
                break;
            }
            case c: {
                break;
            }
            case d: {
                break;
            }
            default:
                break switchCaseQuestion22;
        }
    }

}

































