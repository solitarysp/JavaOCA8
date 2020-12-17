package com.lethanh98.java.learn.oca8.chap3.UnderstandingEquality;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2();
    }

    private void example2() {
        log.info(BASE_LOG, "example2");

        String x = "Hello World";
        String z = " Hello World".trim();
        log.info("x == z : {}", x == z); // false vì trim sẽ trả về 1 object mới nếu xóa khoảng trắng thành công

        String c = "Hello World".trim();

        log.info("x == c : {}", x == c); // là true vì trim vẫn trả về object cũ vì không có sử xóa khoảng trắng nào
    }

    private void example() {
        log.info(BASE_LOG, "example");
        String x = "Hello World";
        String y = "Hello World";
        log.info("x == y : {}", x == y);// Vì cùng trỏ vào String poll nên cùng 1 ref
    }


}
