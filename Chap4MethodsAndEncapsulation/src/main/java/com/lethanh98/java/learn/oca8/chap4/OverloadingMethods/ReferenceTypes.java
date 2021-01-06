package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReferenceTypes {
    public static void main(String[] args) {
        ReferenceTypes referenceTypes = new ReferenceTypes();
        referenceTypes.setData(new A());
        referenceTypes.setData(new D());
        referenceTypes.setData("A");
    }

    public void setData(A a) {
        log.info("A");
    }

    public void setData(B a) {
        log.info("B");
    }

    public void setData(C a) {
        log.info("C");
    }

    public void setData(Object a) {
        log.info("Object");
    }

    static class A {
    }
    static class B extends A {
    }
    static class C extends B {
    }
    static class D extends C {
    }
}
