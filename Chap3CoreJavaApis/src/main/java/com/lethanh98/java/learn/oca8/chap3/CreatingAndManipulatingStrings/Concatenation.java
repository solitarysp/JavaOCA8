package com.lethanh98.java.learn.oca8.chap3.CreatingAndManipulatingStrings;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * Đặt một String trước một String khác, sau đó nối chúng lại với nhau được gọi là ``string concatenation`
 * 1 số quy tắc :
 *               Cả 2 toán hạng đều là số. + là phép cộng số
 *               Nếu 1 trong 2 toán hàng là chuỗi. + được hiểu là phép nối chuỗi
 *               Việc đánh giá và chạy biểu thức được thực hiện từ trái qua phải
 */
public class Concatenation implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Concatenation();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2();
    }

    private void example2() {
        log.info(BASE_LOG, "example2");
        int a = 1;
        String b = a + "B"; // 1B
        String c = "C";
        c += a; // C1
        log.info("B = {}", b);
        log.info("C = {}", c);
    }

    public void example() {
        log.info(BASE_LOG, "example");
        log.info("1 + 2 = {}", 1 + 2); // Quy tắc 1
        log.info("\"a\" + \"b\" = {}", "a" + "b"); // Quy tắc thứ 2
        log.info("\"a\" + \"b\" + 3 = {}", "a" + "b" + 3); // QUy tắc 2 và 3
        log.info("1 + 2 + \"c\" = {}", 1 + 2 + "c"); // QUy tắc 3
    }
}
