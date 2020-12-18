package com.lethanh98.java.learn.oca8.chap3.CreatingAndManipulatingStrings;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
/**
 * Đặt một String trước một String khác, sau đó nối chúng lại với nhau được gọi là ``string concatenation`
 * 1 số quy tắc :
 *               Cả 2 toán hạng đều là số. + là phép cộng số
 *               Nếu 1 trong 2 toán hàng là chuỗi. + được hiểu là phép nối chuỗi
 *               Việc đánh giá và chạy biểu thức được thực hiện từ trái qua phải
 */

public class StringPoll implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new StringPoll();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2();
        example3();
        example4();
        example5();
    }
    static String string5Example="Le";
    private void example5() {
        log.info(BASE_LOG, "example5");
        final String b = "Thanh"; // Trong pool
        final String c = "LeThanh"; // Trong pool
        final String d = string5Example + b; // string5Example không phải final nên không đc vào constant
        log.info("{}", c == d);
    }

    private void example4() {
        log.info(BASE_LOG, "example4");
        final String a = "Le"; // Trong pool
        final String b = "Thanh"; // Trong pool
        final String c = "LeThanh"; // Trong pool
        final String d = a + b; // đc đưa vào pool vì 2 data sử dụng để + là constant
        log.info("{}", c == d);
    }

    private void example3() {
        log.info(BASE_LOG, "example3");
        String a = "Le"; // Trong pool
        String b = "Thanh"; // Trong pool
        String c = "LeThanh"; // Trong pool
        String d = a + b; // Không được cho vào String poll vì, A và B không phải constan
        log.info("{}", c == d);
    }

    private void example2() {
        log.info(BASE_LOG, "example2");

        try {
            String s = "Testtttt";
            String s2 = "Testtttt";
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(s, "1".toCharArray()); // Set is 1
            log.info("{}", s); // SHow is 1
            log.info("{}", s2);// SHow is 1
            String s3 = "Testtttt"; // vẫn là 1
            log.info("{}", s3);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void example() {
        log.info(BASE_LOG, "example");
        log.info("1 + 2 = {}", 1 + 2); // Quy tắc 1
        log.info("\"a\" + \"b\" = {}", "a" + "b"); // Quy tắc thứ 2
        log.info("\"a\" + \"b\" + 3 = {}", "a" + "b" + 3); // QUy tắc 2 và 3
        log.info("1 + 2 + \"c\" = {}", 1 + 2 + "c"); // QUy tắc 3
    }
}
