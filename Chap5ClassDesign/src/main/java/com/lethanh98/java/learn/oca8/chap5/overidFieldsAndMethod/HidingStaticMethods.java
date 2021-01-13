package com.lethanh98.java.learn.oca8.chap5.overidFieldsAndMethod;

public class HidingStaticMethods {
    public static void main(String[] args) {
        HSB.show();
    }
}

class HSA {
    public static String name = "B";

    public static void show() {
        System.out.printf("A");
    }
}

class HSB extends HSA {
    public static String name = "B";

    public static void show() {
        System.out.printf("A");
    }
}
