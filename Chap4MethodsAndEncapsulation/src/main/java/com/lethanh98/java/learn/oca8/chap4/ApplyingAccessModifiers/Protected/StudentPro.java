package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Protected;

import com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Protected.clazz.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentPro extends Student {

    public StudentPro() {
    }

    public void showNameParent() {
        log.info("{}", name);

    }

    public void showByMethodSubclass() {
        StudentPro studentPro = new StudentPro();
        studentPro.setName("f");
        log.info("{}", studentPro.name);

    }
    public void showByMethodSubclassRefClassCha() {
        Student studentPro = new StudentPro();
        // không thể call từ Student vì không cùng Student
    //    studentPro.setName("f");

    }

    void showName() {
        //  log.info("{}",student.name);
    }
}
