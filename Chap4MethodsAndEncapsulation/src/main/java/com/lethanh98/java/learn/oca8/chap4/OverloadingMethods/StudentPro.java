package com.lethanh98.java.learn.oca8.chap4.OverloadingMethods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentPro {

    public void setAge(Integer age) {
        log.info("Integer");

    }

    public static void main(String[] args) {
        StudentPro studentPro=new StudentPro();
        studentPro.setAge(1);
        Integer age=1;
        studentPro.setAge(age);
    }
}
