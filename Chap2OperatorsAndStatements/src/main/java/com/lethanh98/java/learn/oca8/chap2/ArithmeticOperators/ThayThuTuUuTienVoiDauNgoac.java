package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThayThuTuUuTienVoiDauNgoac implements Operators {
    public static void main(String[] args) {
        Operators operators = new ThayThuTuUuTienVoiDauNgoac();
        operators.run();
    }

    @Override
    public void run() {
        int x = 2 * 2 + (((2 * 2) * 2) * 2);
        log.info("Trong ngoặc sẽ được ưu tiên trước 1: {}", x);
        int y = 100 / 10 / (10 / 5);
        log.info("Trong ngoặc sẽ được ưu tiên trước 2: {}", y);
    }
}
