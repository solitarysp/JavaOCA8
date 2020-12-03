package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j

public class ifThenStatement implements Operators {
    public static void main(String[] args) {
        Operators operators = new ifThenStatement();
        operators.run();
    }

    @Override
    public void run() {
        example0(13);
        example1(13);
        example2(13);
        example3(13);
    }

    private void example0(int number) {
        if (number < 11)



        log.info("< 11");
        log.info("LeThanh");
        log.info("LeThanh2");
    }
    private void example1(int number) {
        if (number < 11)
            log.info("< 11");
        log.info("LeThanh");

        log.info("LeThanh2");
    }

    private void example2(int number) {
        if (number < 11) {
            log.info("< 11");
            log.info("LeThanh");

            log.info("LeThanh2");
        }

    }
    private void example3(int number) {
        if (number < 11)
            log.info("< 11");
        else
            log.info("> 11");
    }
    // Lỗi không bảo giờ chạy 1 số else vì nếu vào elese đó thì điều kiện trước đã vào
    private void example4(int number) {
        if (number < 11)
            log.info("< 11");
        else
        if (number < 10)
            log.info("< 10");
        else
        if (number < 9)
            log.info("< 9");
    }


}
