package com.lethanh98.java.learn.oca8.chap2.ArithmeticOperators;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorKhongTheSuDung implements Operators {
    public static void main(String[] args) {
        Operators operators = new ErrorKhongTheSuDung();
        operators.run();
    }

    @Override
    public void run() {
//        int x = 5 + 2 * 2 + (5++);
//        int b = 5 + 2 * 2 + (++5);
//        int c = 5 + 2 * 2 + (5 + "d"); // không được vì đang yêu cầu nhận response là int. Nếu là String thì sẽ ok
//        boolean bl = true;
//        bl + 0; // boolean không thể cộng chuỗi
//        char f = 't';
//      String v  = f + 'f'; // không được vì đang yêu cầu nhận response là String. Nếu là int thì sẽ ok. Vì Java sẽ convert char to decimal
//        // có thể sử dụng   String v = String.valueOf(f + 'f');
//        log.info("{}",v);

    }
}
