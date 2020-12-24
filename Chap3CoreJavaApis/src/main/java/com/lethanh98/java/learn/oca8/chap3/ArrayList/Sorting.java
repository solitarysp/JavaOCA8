package com.lethanh98.java.learn.oca8.chap3.ArrayList;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@SuppressWarnings("all")

public class Sorting implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Sorting();
        baseInterface.run();
    }

    @Override
    public void run() {
        example1();
    }

    private void example1() {
        log.info(BASE_LOG, "example1");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers); // Để sắp xếp, mặc định sẽ tư thấp đến cao
        log.info("{}",numbers);
    }

}
