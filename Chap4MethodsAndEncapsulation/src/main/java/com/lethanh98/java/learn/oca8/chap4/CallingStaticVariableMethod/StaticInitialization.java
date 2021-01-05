package com.lethanh98.java.learn.oca8.chap4.CallingStaticVariableMethod;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

import static com.lethanh98.java.learn.oca8.chap4.CallingStaticVariableMethod.StringUtils.*;

@Slf4j
@SuppressWarnings("all")

public class StaticInitialization implements BaseInterface {
    private static final int two;
    private static final int three = 3;
    private static int one;
    static {
        one = 1;
        two = 2;

    }

    public static void main(String[] args) {
        BaseInterface baseInterface = new StaticInitialization();
        baseInterface.run();
    }

    @Override
    public void run() {
        count++;
        log.info(toLowerCase("TEST"));
    }


}
