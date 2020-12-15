package com.lethanh98.java.learn.oca8.chap3.CreatingAndManipulatingStrings;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImportantStringMethod implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new ImportantStringMethod();
        baseInterface.run();
    }

    @Override
    public void run() {
        length();
        charAt();
        indexOf();
        substring();
        substringError();
        toLowerCaseAndToUpperCase();
        equalsAbdEqualsIgnoreCase();
    }

    private void equalsAbdEqualsIgnoreCase() {
        log.info(BASE_LOG, "equalsAbdEqualsIgnoreCase");

    }

    private void toLowerCaseAndToUpperCase() {
        log.info(BASE_LOG, "toLowerCaseAndToUpperCase");
        String s = "TesT";
        log.info("toLowerCase : {}", s.toLowerCase());
        log.info("toUpperCase : {}", s.toUpperCase());
    }

    private void substringError() {
        try {
            log.info(BASE_LOG, "substringError");
            String s = "TesT";
            log.info("{}", s.substring(3, 3)); // Start từ 3, end =3 . 3-3 = 0 nên không lấy đc phần từ nào
            // log.info("{}", s.substring(3, 6)); // Vượt quá length
            log.info("{}", s.substring(3, 2)); // Start từ 3 . End =2 => 2 - 3 = -1. Không thể lấy số phẩn tử < 0
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    private void substring() {
        log.info(BASE_LOG, "substring");
        String s = "TesT";
        log.info("{}", s.length());
        log.info("{}", s.substring(1));

        log.info("{}", s.substring(s.indexOf("e")));

        log.info("{}", s.substring(1, 3));
    }

    private void indexOf() {
        log.info(BASE_LOG, "indexOf");
        String s = "TesT";
        log.info("{}", s.indexOf('T'));
        log.info("{}", s.indexOf('e'));
        log.info("{}", s.indexOf('Z'));

    }

    private void charAt() {
        log.info(BASE_LOG, "charAt");
        String s = "Test";
        log.info("{}", s.charAt(0));
        log.info("{}", s.charAt(1));
        log.info("{}", s.charAt(2));
        log.info("{}", s.charAt(3));
    }

    private void length() {
        log.info(BASE_LOG, "length");
        String s = "Test";
        log.info("{}", s.length());
    }


}
