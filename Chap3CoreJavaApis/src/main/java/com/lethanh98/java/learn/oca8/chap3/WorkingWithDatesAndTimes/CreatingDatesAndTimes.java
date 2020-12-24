package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class CreatingDatesAndTimes implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new CreatingDatesAndTimes();
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
        example4();
        example5();
    }

    private void example5() {
        log.info(BASE_LOG, "example5");

        ZoneId zoneId = ZoneId.systemDefault();
        log.info("Default zone là zone hiện tại của server : {}", zoneId);

        log.info("Zone   : {}", ZoneId.of("America/New_York"));
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30, 00);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime1, ZoneId.of("America/New_York"));
        log.info("{}", zonedDateTime);
        log.info("{}", zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Ho_Chi_Minh")));
    }

    private void example4() {

        log.info(BASE_LOG, "example4");
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30, 00);
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(6, 15);               // hour and minute
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    }

    private void example3() {
        log.info(BASE_LOG, "example3");
        LocalTime time1 = LocalTime.of(6, 15);               // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30);          // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);     // + nanoseconds
    }

    private void example2() {
        log.info(BASE_LOG, "example2");
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        log.info("{}", date1.equals(date1));
    }

    private void example() {
        log.info(BASE_LOG, "example");
        /**
         *  ISO-8601 format {@code WWWW-MM-dd}
         */
        log.info("{}", LocalDate.now().toString()); // 2020-12-24
        /**
         *  The output will be one of the following ISO-8601 formats:
         *  <ul>
         *  <li>{@code HH:mm}</li>
         *  <li>{@code HH:mm:ss}</li>
         *  <li>{@code HH:mm:ss.SSS}</li>
         *  <li>{@code HH:mm:ss.SSSSSS}</li>
         *  <li>{@code HH:mm:ss.SSSSSSSSS}</li>
         */
        log.info("{}", LocalTime.now());

        /**
         * <ul>
         *  <li>{@code uuuu-MM-dd'T'HH:mm}</li>
         *  <li>{@code uuuu-MM-dd'T'HH:mm:ss}</li>
         *  <li>{@code uuuu-MM-dd'T'HH:mm:ss.SSS}</li>
         *  <li>{@code uuuu-MM-dd'T'HH:mm:ss.SSSSSS}</li>
         *  <li>{@code uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSS}</li>
         * </ul>
         */
        log.info("{}", LocalDateTime.now());

    }


}
