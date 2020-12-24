package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
    }

    private void example() {
        log.info(BASE_LOG, "example");

    }


}
