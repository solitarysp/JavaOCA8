package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

/**
 * Toán tử Increment(++) sử dụng để tăng 1 giá trị. có 2 cách để sử dụng là Post-increment operator và Pre-increment operator
 * !(operand)
 * Chỉ có tác dụng với boolean
 */
@Slf4j
public class OperatorsIncrement implements Operators {
    public static void main(String[] args) {
        Operators operators = new OperatorsIncrement();
        operators.run();
    }

    @Override
    public void run() {
        post();
        pre();
        example1();

    }

    private void example1() {
        int a = 1;
        boolean b = a++ == a++;
        log.info("{}, {}", b, a);
    }


    /**
     * ++ ĐƯợc đặt sau biến.
     * Giá trị của biến sẽ được tăng lên. Nhưng giá trị đó được giữ lại tạm thời cho đến khi câu lệnh hiện tại kết thúc.
     * Giá trị của nó sẽ được cập nhật khi đến câu lệnh tiếp theo
     */
    private void post() {
        log.info("======================post=======================");
        int a = 1;
        // đã tăng lên 2, nhưng ở câu lệnh so sánh và là 1 < 2. Đên câu lệnh tiếp theo thì đã mới là 2
        if (a++ < 2) {
            log.info("< 2 {}", a);
        } else {
            log.info(">= 2 {}", a);
        }
        log.info("======================post=======================");

    }

    private void pre() {
        log.info("======================pre=======================");
        int a = 1;
        // Cũng tăng tương tự như post. nhưng giá trị của biến sẽ được tăng lên ngay lập tực ở chính câu lệnh hiện tại

        // đã tăng lên 2 và được cập nhật luôn nên 2 < 2 is false
        if (++a < 2) {
            log.info("< 2 " + a);
        } else {
            log.info(">= 2 " + a);
        }
        log.info("======================pre=======================");

    }
}
