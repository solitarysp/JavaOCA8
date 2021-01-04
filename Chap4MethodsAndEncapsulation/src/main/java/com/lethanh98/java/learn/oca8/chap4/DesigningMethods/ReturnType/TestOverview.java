package com.lethanh98.java.learn.oca8.chap4.DesigningMethods.ReturnType;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * ReturnType là data type trả về cho nơi thực hiện cuộc gọi method.
 * Nếu không có data trả về, chúng ta trẻ về void
 * void suất phát từ tiếng anh -> không có gì cả
 * ReturnType là require
 */
public class TestOverview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new TestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        requireReturn();
    }

    /**
     * Khi có kiểu data trả về, trong method bắt buộc cần có return trả về giá trị.
     * Nếu không có sẽ lỗi compliter
     */
    private boolean requireReturn() {
        return false;
    }

    /**
     * khi các method có data type trả về là void thì trong method có thể có return hoặc không
     */
    private void notRequireReturn() {
    }

}
