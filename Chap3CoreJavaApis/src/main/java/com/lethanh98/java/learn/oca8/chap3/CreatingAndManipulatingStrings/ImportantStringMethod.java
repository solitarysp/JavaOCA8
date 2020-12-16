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
        startsWithAndEndsWith();
        contains();
        replace();
        trim();
        MethodChaining();
    }

    private void MethodChaining() {
        log.info(BASE_LOG, "MethodChaining");
        String a = "                     LeThanh1998                         ";
        a =  a.trim().replace("1998","2000");
        log.info("MethodChaining : {}",a);
    }

    private void trim() {
        log.info(BASE_LOG, "trim");
        String a = "                     LeThanh1998                         ";
        a = a.trim();
    }

    private void replace() {
        log.info(BASE_LOG, "replace");
        String a = "LeThanh1998";
        a = a.replace("Thanh", "THANH");
        log.info("{}",a);
    }

    private void contains() {
        log.info(BASE_LOG, "contains");
        String a = "LeThanh1998";
        log.info("startsWith offset{}", a.contains("Th"));

    }

    private void startsWithAndEndsWith() {
        log.info(BASE_LOG, "startsWithAndEndsWith");
        String a = "LeThanh1998";
        log.info("startsWith offset{}", a.startsWith("L", 0));
        log.info("startsWith {}", a.startsWith("Le"));
        log.info("endsWith {}", a.endsWith("1998"));
    }

    private void equalsAbdEqualsIgnoreCase() {
        log.info(BASE_LOG, "equalsAbdEqualsIgnoreCase");
        String a = "TesT";
        String b = "test";
        String c = "test";
        log.info("equals : {}", b.equals(c));
        log.info("equalsIgnoreCase : {}", a.equalsIgnoreCase(b));

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
