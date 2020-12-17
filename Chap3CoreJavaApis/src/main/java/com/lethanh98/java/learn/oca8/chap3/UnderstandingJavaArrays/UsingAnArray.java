package com.lethanh98.java.learn.oca8.chap3.UnderstandingJavaArrays;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class UsingAnArray implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new UsingAnArray();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example_Sorting();
        example_Search();
        example_Multidimensional_Array();

    }

    private void example_Multidimensional_Array() {
        log.info(BASE_LOG, "example_Multidimensional_Array");
        int[][] a; // 2 chiều
        a=new int[][]{{}};
        int[] vars3[]; // 2 chiều
        int[] vars4[], space[][]; // 2 chiều và 3 chiều
        vars4=new int[][]{};
        space=new int[][][]{};
        ///
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

    }

    private void example_Search() {
        log.info(BASE_LOG, "example_Search");

        int[] numbers = {4, 2, 1, 5};
        log.info("Arrays.binarySearch(numbers,6) index in : {}", Arrays.binarySearch(numbers, 6));
        log.info("Arrays.binarySearch(numbers,100) index in : {}", Arrays.binarySearch(numbers, 3));
    }

    private void example_Sorting() {
        log.info(BASE_LOG, "example_Sorting");
        int[] a = new int[]{5, 9, 6, 2, 3, 1, 4, 5, 3, 1, 5,};
        log.info("trước khi Arrays.sort(a) {}", a);
        Arrays.sort(a);
        log.info("sau khi Arrays.sort(a) {}", a);

        String[] b = new String[]{"1c", "2c", "4c", "3c"};
        log.info("trước khi Arrays.sort(b) {}", Arrays.toString(b));
        Arrays.sort(b);
        log.info("sau khi Arrays.sort(b) {}", Arrays.toString(b));


    }

    private void example() {
        int[] numbers = new int[10];
        // numbers[numbers.length] = 1; // lỗi vì start từ 0 nên chỉ có từ 0 đến 9 index
    }

}
