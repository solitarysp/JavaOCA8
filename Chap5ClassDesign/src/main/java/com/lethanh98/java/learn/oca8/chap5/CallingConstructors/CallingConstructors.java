package com.lethanh98.java.learn.oca8.chap5.CallingConstructors;

public class CallingConstructors {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public String a;

    public A() {
        super();
        System.out.println("a");
    }

    private String getA() {
        return a;
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}
