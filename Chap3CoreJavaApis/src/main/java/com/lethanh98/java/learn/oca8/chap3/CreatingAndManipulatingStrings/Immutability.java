package com.lethanh98.java.learn.oca8.chap3.CreatingAndManipulatingStrings;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
/**
 * Mutable là 1 từ có ý nghĩa là có thể thay đổi. trong khi Imutability thì ngược lại, chỉ đến sự không thể thay đổi.
 *
 */
public class Immutability implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Immutability();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2();
    }

    private void example2() {
        log.info(BASE_LOG, "example2");
        try {
            String s = "Testtttt";
            String s2 = "Testtttt";
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(s,"1".toCharArray()); // Set is 1
            log.info("{}",s); // SHow is 1
            log.info("{}",s2);// SHow is 1
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
