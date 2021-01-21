package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.CallingConstructors;

public class CallingConstructors2 {
    public static void main(String[] args) {
        B2 b2=new B2();
    }
}

class A2 {
    public A2() {
        System.out.println("A2 dcd gọi");
    }
}

class B2 extends A2 {
    public B2() {
        this("call b2(String)");
    }

    public B2(String a) {
        this("call b2(String)", "call b2(String)");

    }

    public B2(String a, String b) {
    }
}