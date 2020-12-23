package com.lethanh98.java.learn.oca8.chap3.boxing;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
public class AutoBoxing implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new AutoBoxing();
        baseInterface.run();
    }

    @Override
    public void run() {
        exampleAUtoBoxing(1);// Bản chất sẽ gọi Integer.valueOf(int i)
        Integer number = 1;
        exampleUnBoxing(number);// Bản chất sẽ gọi Integer.intValue()

    }
    /**
     * unBoxing là việc java tự động support chúng ta chuyển đổi 1 kiểu dữ liệu primitive wrapper class đến primitive
     */
    private void exampleUnBoxing(int number) {
        log.info(BASE_LOG, "exampleUnBoxing");

    }

    /**
     * AUtoBoxing là việc java tự động support chúng ta chuyển đổi 1 kiểu dữ liệu primitive đến primitive wrapper class
     */
    private void exampleAUtoBoxing(Integer number) {
        log.info(BASE_LOG, "exampleAUtoBoxing");
    }
}
