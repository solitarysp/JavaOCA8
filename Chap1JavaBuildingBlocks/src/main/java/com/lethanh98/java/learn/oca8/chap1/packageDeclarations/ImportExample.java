package com.lethanh98.java.learn.oca8.chap1.packageDeclarations;

/**
 * Cần import class sử dụng để java có thể tìm kiếm đến
 */

import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
