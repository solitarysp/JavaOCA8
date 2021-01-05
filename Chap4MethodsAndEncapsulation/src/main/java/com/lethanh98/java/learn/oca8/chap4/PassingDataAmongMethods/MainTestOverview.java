package com.lethanh98.java.learn.oca8.chap4.PassingDataAmongMethods;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import com.lethanh98.java.learn.oca8.chap4.CallingStaticVariableMethod.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")

public class MainTestOverview implements BaseInterface {
    StringUtils stringUtils2;

    public static void main(String[] args) {
        BaseInterface baseInterface = new MainTestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        example3();
    }

    private void example3() {
        log.info(BASE_LOG, "example3");
        StringBuilder builder = new StringBuilder("Thanh");
        // Thanh đổi thành công, bởi vì chúng ta sử data bên trong StringBuild Chứ chúng ta không thay đổi địa chỉ bộ nhớ trỏ đến
        changeNameUsingStringBuilder(builder);
        log.info("{}", builder);
    }

    private void changeNameUsingStringBuilder(StringBuilder builder) {
        builder.setLength(0);
        builder.append("Hai");
    }

    private void example2() {
        log.info(BASE_LOG, "example2");
        String name = "Thanh";
        changeName(name);
        log.info("{}", name);

    }

    private void changeName(String name) {
        name = "Hải";
    }

    private void example1() {
        log.info(BASE_LOG, "example1");
        int number = 1;
        // giá trị method nhận được là bản coppy, việc thực hiện hành động trong method sẽ không làm ảnh hướng đến
        // data của người gửi đến
        changeNumber(number);
        log.info("{}", number);
    }

    private void changeNumber(int number) {
        number = 10;
    }

}
