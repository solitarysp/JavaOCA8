package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Month;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class ManipulatingDatesAndTimes implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new ManipulatingDatesAndTimes();
        baseInterface.run();
    }

    @Override
    public void run() {
        /**
         * CƠ bản
         */
        example();
        example2();
    }

    private void example2() {
        log.info(BASE_LOG, "example2");
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        log.info(" {}", date);

        date = date.minusDays(1);
        log.info("date = date.minusDays(1) : {}", date);

        date = date.minusMonths(1);
        log.info(" date = date.minusMonths(1) : {}", date);
        date = date.minusYears(1);
        log.info(" date.minusYears(1) : {}", date);
    }

    private void example() {
        log.info(BASE_LOG, "example");
        // Các date mới trong java 8 là immutable, nó giống như String
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        log.info("{}", date);
        date.plusDays(2);
        log.info("date.plusDays(2) : {}", date);
        date = date.plusDays(2);
        log.info("date = date.plusDays(2) : {}", date);
        date = date.plusDays(-5);
        log.info("date = date.plusDays(-5) : {}", date);
    }

}
