package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Default;

import com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Default.clazz.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentPro extends Student {
    Student student;

    public StudentPro(Student student) {
        this.student = student;
    }

    //  @Override
    public void setName(String name) {
        log.info("set name StudentPro");
    }

    void showName() {
        //   log.info("{}",student.name);
    }
}
