package com.lethanh98.java.learn.oca8.chap5.ImplementingInterfaces.DefaultMethod;

public class SimpleDefaultMethod {
}

interface Ia {
    default void test() {
        System.out.printf("IA");
    }
}

interface IB {
    default void test() {
        System.out.printf("Ib");
    }
}

interface IC extends Ia, IB {

    @Override //require
    default void test() {
    }
}

class Impl1 implements Ia, IB {
    @Override  //require
    public void test() {

    }
}