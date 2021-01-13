package com.lethanh98.java.learn.oca8.chap5.overidFieldsAndMethod;

public class RedeclaringPrivateMethods {
    public static void main(String[] args) {

    }
}

class RPA {
    private void show() {
        System.out.printf("Name");
    }
}

class RPB extends RPA {
    public void show() {
        System.out.printf("Name");
    }
}
