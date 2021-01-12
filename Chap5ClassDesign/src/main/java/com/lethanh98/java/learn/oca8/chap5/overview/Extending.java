package com.lethanh98.java.learn.oca8.chap5.overview;

import com.lethanh98.java.learn.oca8.chap5.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
public class Extending implements BaseInterface {
    private String a;

    public static void main(String[] args) throws Exception {
        BaseInterface baseInterface = new Extending();
        baseInterface.run();

    }

    private void ClassConTruyCapThuocTinhClassCha() {
        log.info(BASE_LOG, "ClassConTruyCapThuocTinhClassCha");

        StudentVip studentVip = new StudentVip();
        studentVip.setName("Thanh");
        System.out.println(studentVip.getName());
    }

    @Override
    public void run() throws Exception {

        ClassConTruyCapThuocTinhClassCha();

        TruyCapThuocTinhClassKhongChoPhepTruyCap();
    }

    private void TruyCapThuocTinhClassKhongChoPhepTruyCap() throws NoSuchFieldException, IllegalAccessException {
        log.info(BASE_LOG, "TruyCapThuocTinhClassKhongChoPhepTruyCap");

        StudentVip studentVip = new StudentVip();
        studentVip.setName("Thanh");
        /**
         * Vì bản chất thuộc tính age ở class cha chứ k phải ở class con, vì vậy cần truy cập ở class cha.
         * nếu truy cập ở class con sẽ không tìm thấy
         */
        Field field = Student.class.getDeclaredField("age");
        System.out.println(" Age: " + field.get(studentVip));
    }


    class StudentVip extends Student {

    }

    public class Student {
        private String name;
        private Integer age = 18;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
