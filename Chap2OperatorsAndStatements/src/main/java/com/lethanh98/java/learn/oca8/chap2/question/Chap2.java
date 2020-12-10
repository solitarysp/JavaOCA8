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
        question16();
        question17();
        question18();
        question19();
        question20();
        question21();
        question22(1);
        question23();
        question24();
        question25();
        question26();
        question27();
        question28();
        question29();
        question30();
    }

    /**
     * Vì Assignment multil Vaule sẽ theo thứ tự từ trái qua phải, vì vậy khi đó b sẽ chưa được khởi tạo
     * Ví dụ ở dưới flow sẽ là
     * Step 1 : Set A = b
     * Step 2 : Set b = 4
     * Vì step 1 chưa có b nên sẽ lỗi
     */
    private void question16() {
//        int a = b, b = 4;
//        log.info("{} and {}", a, b);
    }

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
    private void question18() {
//        int a = 1;
//        int b = a = 2;
//        int c = 3 = b;
//        log.info("{} and {} and {}", a, b, c);
    }

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
        if (number > 6 && number < 10) log.info("number > 6 and");
        log.info("number < 10");
        if (number > 10 && number < 2) ;
        log.info("number > 10 and");
        log.info("number < 2");
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
//        final char a = '1';
//        final int b = 2;
//        int c = 3;
//
//switchCaseQuestion22: switch (1) {
//            case a: {
//                break;
//            }
//            case b: {
//                break;
//            }
//            case c: {
//                break;
//            }
//            case d: {
//                break;
//            }
//            default:
//                break switchCaseQuestion22;
//        }
    }

    private void question23() {
        int count = 0;
        Root:
        for (int i = 0; i < 5; i++) {
            count++;
            Sub_Root_One:
            for (int j = 0; j < 5; j++) {
                count++;
                Sub_Root_TWO:
                for (int k = 0; k < 5; k++) {
                    count++;
                    break Sub_Root_TWO;
                }
                continue Sub_Root_One;
            }
            break Root;
        }
        log.info("{}", count);
    }

    // vì a không bao giờ xuống nhỏ hơn 0 được khi hết while (a >1){ thì a sẽ mãi mãi = 1;
    private void question24() {
//        int a = 10;
//        byte count = 127;
//        do {
//            while (a >1){
//                count++;
//                a--;
//            }
//        }while (a==1);
//        log.info("{}",count);
    }

    private void question25() {
        char a = '1';
        short b = '2';

//        int c = a + b;
//        long d = a + b;
//        double f = a + b;
//        char g = a + b;
//        short z = a + b;
//        float c = a + b;
    }

    private void question26() {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        Float e = 100f;
        Float f = 100f;
        Long z = 100l;
        Long w = 100l;
        log.info("{} , {} , {}, {} , {}", a == b, c == d, e == f, z == w, e.equals(f));
    }

    private void question27() {
//        int x = 5 + 2 * 2 + (5++);
//        int b = 5 + 2 * 2 + (++5);
//        int c = 5 + 2 * 2 + (5 + "d"); // không được vì đang yêu cầu nhận response là int. Nếu là String thì sẽ ok
//        boolean bl = true;
//        bl + 0;
//        char f = 't';
//        String v  = f + 'f';  //không được vì đang yêu cầu nhận response là String. Nếu là int thì sẽ ok. Vì Java sẽ convert char to decimal
    }

    private void question28() {
//        String a = "9";
//        int count = 0;
//        for (int i = 0; !a.equals(i); i++) {
//            count++;
//        }
//        log.info("{}",count);
    }

    private void question29() {
        int count = 0;
        for (int i = 0; i < 5; i++); count++;

        for (int i = 0; i < 5; i++) count++;

        log.info("{}",count);
    }

    private void question30() {
        String name = new String("thanh");
        switch (name) {
            case "thanh":
                log.info("thanh");
                break;
            case "tuan":
                log.info("tuan");
                break;
            default:{
                log.info("Default");
            }
        }
    }

}

































