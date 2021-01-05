package com.lethanh98.java.learn.oca8.chap4.ApplyingAccessModifiers.Protected;

import com.lethanh98.java.learn.oca8.chap4.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * Default là quyền truy cập chỉ có thể truy cập bên trong the same package và the same class
 * Chúng ta k có keywork Default, vì vậy khi chúng ta không khai báo modifiers thì sẽ là Default
 */
public class MainTestOverview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new MainTestOverview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
    }

    private void example() {
        StudentPro studentPro = new StudentPro();
    }


}
