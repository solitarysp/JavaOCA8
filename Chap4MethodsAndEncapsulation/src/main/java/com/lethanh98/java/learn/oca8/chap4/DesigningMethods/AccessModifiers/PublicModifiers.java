package com.lethanh98.java.learn.oca8.chap4.DesigningMethods.AccessModifiers;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * AccessModifiers sử dụng để khai báo quyền truy cập đến method
 */
public class PublicModifiers implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new PublicModifiers();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
    }

    public void example() {
        log.info(BASE_LOG, "example");

    }


}
