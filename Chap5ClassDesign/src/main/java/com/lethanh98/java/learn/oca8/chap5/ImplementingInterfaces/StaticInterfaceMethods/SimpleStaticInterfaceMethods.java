package com.lethanh98.java.learn.oca8.chap5.ImplementingInterfaces.StaticInterfaceMethods;

public class SimpleStaticInterfaceMethods {
    public static void main(String[] args) {
        System.out.printf(IA.age());
    }

}

interface IA {
    static String age() {
        return "8";
    }
}
interface IB {
    static String age() {
        return "8";
    }
}
interface IC extends IA,IB {
}
class ClassImpl1 implements IA {
    public void testErr() {
       // age();
    }

    public void testOK() {
        IA.age();
    }
}
class ClassImpl2 implements IC {

    public void testOK() {
        IA.age();
    }
}
