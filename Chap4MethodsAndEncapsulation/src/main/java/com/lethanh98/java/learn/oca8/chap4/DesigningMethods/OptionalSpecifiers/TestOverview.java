package com.lethanh98.java.learn.oca8.chap4.DesigningMethods.OptionalSpecifiers;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * Các OptionalSpecifiers thêm cho method, mỗi một OptionalSpecifiers thêm sẽ bao gồm các tính năng thêm của method
 */
public abstract class TestOverview implements BaseInterface {
    public static void main(String[] args) {
    }

    static public void example() {
        log.info(BASE_LOG, "example");

    }

    final public void example1() {
        log.info(BASE_LOG, "example");

    }

    static final public void example2() {
        log.info(BASE_LOG, "example");

    }

    abstract public void example3();

    strictfp  public void example4() {
        log.info(BASE_LOG, "example");

    }

    @Override
    public void run() {
        example();
    }


}
