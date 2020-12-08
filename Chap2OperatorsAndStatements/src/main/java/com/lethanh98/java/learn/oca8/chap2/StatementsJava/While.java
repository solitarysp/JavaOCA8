package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Với While: Chúng ta sẽ kiểm tra điều kiện trước sau đo sẽ chạy block mã.
 * Sau khi chạy xong block mã chúng ta sẽ tiếp tục check lại điều kiện và chạy lại cho đến khi điều kiện là false
 */
public class While implements Operators {
    public static void main(String[] args) {
        Operators operators = new While();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        //   exampleInfiniteLoops();
        example2();
    }

    private void exampleInfiniteLoops() {
        log.info("=====================exampleInfiniteLoops==================");
        while (true) {
            int a = 1;
        }
    }

    // ví dụ không bao giờ chạy block vì lần đầu đã false
    private void example1() {
        log.info("=====================example1==================");
        int a = 1;
        while (a > 1) {
            log.info("A > 1");
        }
    }

    private void example2() {
        log.info("=====================example2==================");
        int a = 1;
        while (a > 0)
            log.info("A > 1", a = 0);
    }
}
