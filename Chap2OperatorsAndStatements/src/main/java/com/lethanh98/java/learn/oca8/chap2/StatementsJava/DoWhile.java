package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Với do while, code trong block sẽ được chạy ít nhât 1 lần. sau đó điều kiện mới bắt đầu được check để chạy lần tiếp theo.
 * Đoạn mã của chúng tôi sẽ chạy hết block. Sau đó chúng tôi sẽ kiểm tra các điều kiện để có thực hiện chạy lại đoạn mã trong block đó hay không?
 */
public class DoWhile implements Operators {
    public static void main(String[] args) {
        Operators operators = new DoWhile();
        operators.run();
    }

    @Override
    public void run() {
        example1();
    }

    private void example1() {
        log.info("=======================example1=================");
        int a = 1;
        do
            log.info("");
        while (a == 1);
    }

    private void example2() {
        log.info("=======================example2=================");
        int a = 1;
        do {
            log.info("");
        }
        while (a == 1);
    }

}
