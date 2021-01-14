package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.ConstructorsInheritance;

import lombok.Data;

public class ConstructorsInheritance {
    public static void main(String[] args) {
        StudentPro studentPro=new StudentPro("thanh");
    }
}

@Data
class Student {
    private String name;
    private Integer age;
    public Student(String name) {
        this(name, 18);
        System.out.println("Student(String name)");
    }

    public Student(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("Student(String name, Integer age)");
    }
}

class StudentVip extends Student {

    public StudentVip(String name) {
        super(name);
     //   this(name);
        System.out.println("StudentVip(String name)");
    }
    public StudentVip(String name, Integer age) {
        super(name, age);
        System.out.println("StudentVip(String name, Integer age)");
    }
}
class StudentPro extends StudentVip {
    public StudentPro(String name) {
        super(name);
        System.out.println("StudentPro(String name)");
    }
    public StudentPro(String name, Integer age) {
        super(name, age);
        System.out.println("StudentPro(String name, Integer age)");

    }
}