package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NhanChiaTruocCongTruSau implements Operators {
    public static void main(String[] args) {
        Operators operators = new NhanChiaTruocCongTruSau();
        operators.run();
    }

    @Override
    public void run() {
        int x = 5 + 2 * 2 + 5;
        log.info("Nhân chia trước, công trừ sau 1: {} ", x);
        int y = 5 + 10 / 2 + 5;
        log.info("Nhân chia trước, công trừ sau 2: {}", x);
    }
}
