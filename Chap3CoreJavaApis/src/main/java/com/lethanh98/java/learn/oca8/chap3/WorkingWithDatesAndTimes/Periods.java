package com.lethanh98.java.learn.oca8.chap3.WorkingWithDatesAndTimes;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@Slf4j
@SuppressWarnings("all")
/**
 *Period có khá nhiều cách dùng, dùng để cộng trừ ngày...etc..
 * Một Period có thể được sử dụng 1 mốt giá trị bao nhiêu tháng bao nhiêu ngày. CHỉ có ngày không cho time
 * Period có thể sử dụng method để so sánh 2 dataTime.
 */
public class Periods implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Periods();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example2();
    }

    private void example2() {
        log.info(BASE_LOG, "example");
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        log.info("{}", Period.between(start, end)); // 2 tháng 29 ngày
    }

    private void example() {
        log.info(BASE_LOG, "example");
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);// 1 là mỗi lần tăng sẽ tăng thêm 1 tháng
        erformAnimalEnrichment(start, end, period);
    }

    private void erformAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);     // adds the period  }}
        }
    }
}
