package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReferenceTypesInterface {
    public static void main(String[] args) {
        ReferenceTypesInterface referenceTypes = new ReferenceTypesInterface();

       // referenceTypes.setName(new C());

        referenceTypes.setName((A) new C());
    }

    public void setName(A a) {
        log.info("A");
    }

    public void setName(B b) {
        log.info("B");
    }

    static interface A {
    }

    static interface B {
    }
    static class C implements A, B {
    }
}
