package com.lethanh98.java.learn.oca8.chap4.Constructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorsExample {
    public ConstructorsExample() {
        this(1);
    }

    public ConstructorsExample(long a) {
        log.info("long");
    }

    public ConstructorsExample(byte a) {
        log.info("byte");
    }

    public static void main(String[] args) {
        ConstructorsExample constructorsExample = new ConstructorsExample(1);
    }
}
