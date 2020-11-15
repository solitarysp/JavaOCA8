package com.lethanh98.java.learn.oca8.chap1.UnderstandingDefaultInitializationVariables;

public class LocalVariables {
    /**
     * Một Local Variables là một biến được định nghĩa trong một method. Local Variables phải được khởi tạo trước khi sử dụng. Local Variables không có giá trị mặc định cho đến khi chúng ta khởi tạo.
     * Java compiler sẽ  báo lỗi nếu chúng ta cố tình sử dụng khi chưa khởi tạo
     */
    public void test() {
        int y = 10;
        Integer x;
        //  int reply = x + y; // lỗi vì mới chỉ khai báo x nhưng chưa khởi tạo

    }

    public void test2() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;

    }
}
