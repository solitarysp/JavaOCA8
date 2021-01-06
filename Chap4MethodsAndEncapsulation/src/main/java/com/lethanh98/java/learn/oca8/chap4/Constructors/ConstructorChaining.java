package com.lethanh98.java.learn.oca8.chap4.Constructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorChaining {
    private String name;
    private int age;
    private String address;

    public ConstructorChaining(String name) {
        this(name, 18);

    }

    public ConstructorChaining(String name, int age) {
        this(name, age, "HaNoi");
    }

    public ConstructorChaining(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining("Thanh");
        log.info("{}",constructorChaining);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
