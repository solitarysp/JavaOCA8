package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

/**
 * Toán tử Decrement(--) sử dụng để giảm 1 giá trị. có 2 cách để sử dụng là Post-Decrement operator và Pre-Decrement operator
 * !(operand)
 * Chỉ có tác dụng với boolean
 */
@Slf4j
public class OperatorsDecrement implements Operators {
    public static void main(String[] args) {
        Operators operators = new OperatorsDecrement();
        operators.run();
    }

    @Override
    public void run() {
        post();
        pre();

    }


    /**
     * ++ ĐƯợc đặt sau biến.
     * Giá trị của biến sẽ được giảm xuống 1. Nhưng giá trị đó được giữ lại tạm thời cho đến khi câu lệnh hiện tại kết thúc.
     * Giá trị của nó sẽ được cập nhật khi đến câu lệnh tiếp theo
     */
    private void post() {
        log.info("======================post=======================");

        int a = 2;
        // đã giảm xuông 1 nhưng chưa đc cập nhâth, và  ở câu lệnh so sánh là 2 == 1 . Đên câu lệnh tiếp theo thì đã mới là 1
        if (a-- == 1) {
            log.info("a ==  1 : {}", a);
        } else {
            log.info("a !=  1 : {}", a);
        }
        log.info("======================post=======================");

    }

    private void pre() {
        log.info("======================pre=======================");
        int a = 2;
        // đã giảm xuông 1 và được cập nhật luôn, và  ở câu lệnh so sánh là 1 == 1 1
        if (--a == 1) {
            log.info("a ==  1 : {}", a);
        } else {
            log.info("a !=  1 : {}", a);
        }
        log.info("======================pre=======================");
    }
}
