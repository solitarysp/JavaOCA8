package com.lethanh98.java.learn.oca8.chap5.overidFieldsAndMethod.OveridFields;

public class OveridFields {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getName());
        System.out.println(b.getNameCha());
    }
}

class A {
    public String name = "Cha";
    private Integer age = 40;
    private String address = "HaNoi";

}

class B extends A {
    public String name = "con";
    private String age = "40";

    public String getName() {
        return this.name;
    }
    public String getNameCha() {
        return super.name;
    }
}