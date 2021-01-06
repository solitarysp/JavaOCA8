package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Primitives1 {
    public static void main(String[] args) {
        Primitives1 primitives1 = new Primitives1();
        int a=1;
        byte b=1;
        primitives1.setAge(a);
        primitives1.setAge(b);
    }
    public void setAge(byte a) {
        log.info("byte");
    }
    public void setAge(long a) {
        log.info("long");
    }
    public void setAge(char a) {
        log.info("char");
    }
    public void setAge(char[] a) {
        log.info("char");
    }
    public void setAge(double a) {
        log.info("double");
    }
    public void setAge(float a) {
        log.info("float");
    }
}
