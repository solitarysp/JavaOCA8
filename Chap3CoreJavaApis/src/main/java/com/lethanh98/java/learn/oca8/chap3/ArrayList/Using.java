package com.lethanh98.java.learn.oca8.chap3.ArrayList;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@SuppressWarnings("all")

public class Using implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Using();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example_add();
        example_remove();
        example_set();
        example_clear();
        example_ConvertingBetweenArrayAndList();

    }

    private void example_ConvertingBetweenArrayAndList() {
        log.info(BASE_LOG, "example_ConvertingBetweenArrayAndList");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thanh");
        strings.add("tuan");
        strings.add("tuan2");
        log.info("{}", strings);
        log.info("{}", strings.toArray());
        log.info("{}", strings.toArray(new String[50])); // Lấy về 1 array và có capacity là 50

    }

    private void example_clear() {
        log.info(BASE_LOG, "example_clear");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thanh");
        strings.add("tuan");
        strings.add("hai");
        log.info("{}", strings);
        strings.clear();
        log.info("{}", strings);


    }

    private void example_set() {
        log.info(BASE_LOG, "example_set");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thanh");
        strings.add("tuan");
        strings.add("hai");
        log.info("{}", strings);
        strings.set(1, "huyen");
        log.info("{}", strings);

    }

    private void example_remove() {
        log.info(BASE_LOG, "example_remove");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thanh");
        strings.add("tuan");
        strings.add("hai");
        strings.remove("hai");
        log.info("{}", strings);
        strings.remove(0);
        log.info("{}", strings);

    }

    private void example_add() {
        log.info(BASE_LOG, "example_add");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thanh");
        strings.add("tuan");
        strings.add("hai");
        log.info("{}", strings);
        strings.add(1, "nam");
        log.info("{}", strings);

    }

    private void example() {
        log.info(BASE_LOG, "example");

        ArrayList strings = new ArrayList<>();
        strings.add(1);
        strings.add("a");
        log.info("{}", strings);
    }

}
