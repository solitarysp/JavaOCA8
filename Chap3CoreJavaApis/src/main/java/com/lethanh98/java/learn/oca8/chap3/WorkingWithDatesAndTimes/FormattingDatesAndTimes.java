package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class FormattingDatesAndTimes implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new FormattingDatesAndTimes();
        baseInterface.run();
    }

    @Override
    public void run() {
        /**
         * CƠ bản
         */
        example();
        example2();
        example3();
    }

    private void example3() {
        log.info(BASE_LOG, "example3");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        log.info("M {}", DateTimeFormatter.ofPattern("M").format(dateTime));
        log.info("MM {}", DateTimeFormatter.ofPattern("MM").format(dateTime));
        log.info("MMM {}", DateTimeFormatter.ofPattern("MMM").format(dateTime));
        log.info("MMMM {}", DateTimeFormatter.ofPattern("MMMM").format(dateTime));
        log.info("d {}", DateTimeFormatter.ofPattern("d").format(dateTime));
        log.info("dd {}", DateTimeFormatter.ofPattern("dd").format(dateTime));
        log.info("y {}", DateTimeFormatter.ofPattern("y").format(dateTime));
        log.info("yy {}", DateTimeFormatter.ofPattern("yy").format(dateTime));
        log.info("yyy {}", DateTimeFormatter.ofPattern("yyy").format(dateTime));
        log.info("yyyy {}", DateTimeFormatter.ofPattern("yyyy").format(dateTime));
        log.info("h {}", DateTimeFormatter.ofPattern("h").format(dateTime));
        log.info("hh {}", DateTimeFormatter.ofPattern("hh").format(dateTime));
        log.info("m {}", DateTimeFormatter.ofPattern("m").format(dateTime));
        log.info("mm {}", DateTimeFormatter.ofPattern("mm").format(dateTime));
    }

    private void example2() {
        log.info(BASE_LOG, "example2");

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);


        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
       // System.out.println(time.format(shortDateTime));// Lỗi vì không thể format cho định time đến ngày
    }

    private void example() {
        log.info(BASE_LOG, "example");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }


}
