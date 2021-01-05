package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Default.clazz;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Student {
    String name;

    void setName(String name) {
        this.name = name;
        log.info("set name Student");
    }
}
