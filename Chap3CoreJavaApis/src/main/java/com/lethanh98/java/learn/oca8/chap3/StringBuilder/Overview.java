package com.lethanh98.java.learn.oca8.chap3.StringBuilder;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
public class Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example_TaoQuaNhieuString();
        example_StringBuilder();
        example_StringBuilderChain();
        example_CreatingStringBuilderThere();
    }

    private void example_CreatingStringBuilderThere() {
        log.info(BASE_LOG, "example_CreatingStringBuilderThere");
        // Tạo 1 StringBuilder default với capacity 16
        StringBuilder id = new StringBuilder();
        // Tạo một StringBuilder giá trị khởi đầu là giá trị truyền vào
        // Capacity mặc định = length String input + 16
        StringBuilder id1 = new StringBuilder("Thanh");
        // Tạo  một StringBuilder với capacity khởi điểm  = 16
        StringBuilder id2 = new StringBuilder(10);
    }

    private void example_StringBuilderChain() {
        log.info(BASE_LOG, "example_StringBuilderChain");
        StringBuilder id = new StringBuilder();
        id.append("1").append("2").append(3).append("4");

    }

    private void example_StringBuilder() {
        log.info(BASE_LOG, "example_StringBuilder");
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            id.append(i);
        }
        log.info("{}", id.toString());
    }

    private void example_TaoQuaNhieuString() {
        log.info(BASE_LOG, "example_TaoQuaNhieuString");
        String id = "";
        for (int i = 0; i < 10; i++) {
            id += i;
        }
        log.info("{}", id);
    }


}
