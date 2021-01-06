package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChuyenDoi2Buoc {
    public static void main(String[] args) {
        setAge(1);
        setAge(1L);
    }
    int A;
    public static void setAge(Long a) {
        log.info("Long");
    }

    public static void setAge(Object a) {
        log.info("Long");
    }
}
