package com.lethanh98.java.learn.oca8.chap4.CallingStaticVariableMethod;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")

public class MainTestOverview implements BaseInterface {
    StringUtils stringUtils2;

    public static void main(String[] args) {
        BaseInterface baseInterface = new MainTestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        twoCachCallStatic();
        twoCachCallStatic2();
    }

    private void twoCachCallStatic2() {
        log.info(BASE_LOG, "twoCachCallStatic2");
        log.info("{}", StringUtils.count);
        StringUtils stringUtils = new StringUtils();
        log.info("{}", stringUtils.count);
        stringUtils = null;
        log.info("{}", StringUtils.count);
        log.info("{}", stringUtils2.count);

    }

    private void twoCachCallStatic() {
        log.info(BASE_LOG, "twoCachCallStatic");
        // sử dụng class . method static
        log.info(StringUtils.toLowerCase("TEST"));

        StringUtils stringUtils = new StringUtils();
        log.info(stringUtils.toLowerCase("TEST2"));

        stringUtils = null;
        log.info(stringUtils.toLowerCase("TEST3"));

        log.info(stringUtils2.toLowerCase("TEST4"));


    }


}
