package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Default;

import com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Default.clazz.Student;
import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * Default là quyền truy cập chỉ có thể truy cập bên trong the same package và the same class
 * Chúng ta k có keywork Default, vì vậy khi chúng ta không khai báo modifiers thì sẽ là Default
 */
public class MainTestOverview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new MainTestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example1();
    }

    private void example1() {
        Student student = new StudentPro(new Student());
    }

    private void example() {
        log.info(BASE_LOG, "example");
        Student student = new Student();
//        student.name;
//        student.setName("d");
    }


}
