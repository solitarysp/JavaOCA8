package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Protected.clazz;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentVip {
    Student student;

    public StudentVip(Student student) {
        this.student = student;
    }

    void showName() {
        log.info("{}",student.name);
    }
}
