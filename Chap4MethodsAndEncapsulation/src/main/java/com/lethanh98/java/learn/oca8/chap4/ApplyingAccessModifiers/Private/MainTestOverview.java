package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Private;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * là quyền truy cập đơn giản nhất. Chỉ code bên trong the same class mới có thể truy cập private method hoặc private fields
 */
public class MainTestOverview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new MainTestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
    }

    private void example() {
        log.info(BASE_LOG, "example");
        Student student = new Student();
//        student.name;
//        student.setName("d");
    }


}
