package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class ConvertingToALong implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new ConvertingToALong();
        baseInterface.run();
    }

    @Override
    public void run() {
        /**
         * CƠ bản
         */
        example();
    }

    private void example() {
        log.info(BASE_LOG, "example");
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        log.info("toLocalTime : {}",date1.toEpochDay()); // Số ngày tính từ 1970
    }


}
