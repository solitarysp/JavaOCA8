package com.lethanh98.java.learn.oca8.chap3.StringBuilder;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        StringBuilder id = new StringBuilder();
        StringBuilder id1 = new StringBuilder("Thanh");
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
