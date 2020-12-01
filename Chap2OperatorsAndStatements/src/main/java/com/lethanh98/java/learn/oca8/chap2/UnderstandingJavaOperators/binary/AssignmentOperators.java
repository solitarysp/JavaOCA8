package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Một assignment operator là một Binary Operator được sử dụng để Assignment (gán) dữ liệu cho variable ở bên trái toán tử,
 * với data được gán là giá trị  bên phải của trương trình.
 * Chúng ta không thể gắn 1 giá trị vượt quá giá trị có thể lưu của variable
 */
public class AssignmentOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new AssignmentOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }

    private void example1() {
        int x = 3; // Câu lệnh chỉ định với x được gán vault là 3
    }

    /**
     * Khi chúng ta sử dụng assignment, java có thể tự động chuyển dữ liệu nhỏ hơn sang lớn hớn. . Int -> long
     * Nhưng sẽ có 1 lỗi error nếu chúng ta cố gắng chuyển đổi một kiểu dữ liệu lớn hơn sang nhỏ hơn. long < int
     */
    private void example2() {
        int a = 30000000;
        long b = a; // OK bình thường vì từ nhỏ đến lớn.
//        int c = b; // Lỗi compiler vì không thể từ lớn đến nhỏ
//        int d = 1.2; // Lỗi compiler vì không thể từ lớn đến nhỏ
//        int f = 1f; // Lỗi compiler vì không thể từ lớn đến nhỏ
        //  short y = 1921222;// không thể vì giá trị vượt quá data type
    }


}
