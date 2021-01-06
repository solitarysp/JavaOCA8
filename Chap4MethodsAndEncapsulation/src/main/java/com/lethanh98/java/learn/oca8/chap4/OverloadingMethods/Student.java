package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

public class Student {
    private Integer name;

    public void setName(String name) {
    }

    public void setName(Double name) {
    }

    public void setName(Long name) {
    }

    public void setName(Long name, Double name2) {
    }
}
