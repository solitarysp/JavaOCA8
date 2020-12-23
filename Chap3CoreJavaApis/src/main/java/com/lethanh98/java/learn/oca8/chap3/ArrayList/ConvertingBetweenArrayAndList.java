package com.lethanh98.java.learn.oca8.chap3.ArrayList;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SuppressWarnings("all")

public class ConvertingBetweenArrayAndList implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new ConvertingBetweenArrayAndList();
        baseInterface.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        example3();
    }

    /**
     * Khi sử dụng  Arrays.asList để chuyển một array đến List thì List đó không thể sử đổi, không xóa hay thêm mới đc
     *  Bởi vì nó sẽ tạo một ArrayList, nhưng ArrayList này là ArrayList trong Arrays chứ k phải ArrayList bình thường
     *  ArrayList đó không impl add hay remove.. nên dùng sẽ gọi đến AbstractList nên sẽ lỗi
     */
    private void example3() {
        log.info(BASE_LOG, "example3");
        String[] array = { "hawk", "robin" };
        List<String> list = Arrays.asList(array);
        list.add("Test");
        log.info("{}", list.get(2));

    }

    private void example2() {
        log.info(BASE_LOG, "example1");
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Test3");
        log.info("{}", list.size());
        String[] strings = list.toArray(new String[0]); // Truyền thêm tham số là tạo mới 1 array với data mong muốn convert về
        log.info("{}", strings[0]);
    }

    private void example1() {
        log.info(BASE_LOG, "example1");
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Test3");
        log.info("{}", list.size());
        Object[] strings = list.toArray(); // Mặc định toArray sẽ trả về array Object
        log.info("{}", strings.length);// leng là bằng nhau khi convert về

    }


}
