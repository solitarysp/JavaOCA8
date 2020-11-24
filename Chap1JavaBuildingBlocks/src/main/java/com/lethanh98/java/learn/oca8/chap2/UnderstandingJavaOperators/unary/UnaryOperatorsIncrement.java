package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

/**
 * Toán tử Increment(++) sử dụng để tăng 1 giá trị. có 2 cách để sử dụng là Post-increment operator và Pre-increment operator
 * !(operand)
 * Chỉ có tác dụng với boolean
 */
public class UnaryOperatorsIncrement implements UnaryOperators {
    public static void main(String[] args) {
        UnaryOperators unaryOperators = new UnaryOperatorsIncrement();
        unaryOperators.run();
    }

    @Override
    public void run() {
        post();
        pre();

    }


    /**
     * ++ ĐƯợc đặt sau biến.
     * Giá trị của biến sẽ được tăng lên. Nhưng giá trị đó được giữ lại tạm thời cho đến khi câu lệnh hiện tại kết thúc.
     * Giá trị của nó sẽ được cập nhật khi đến câu lệnh tiếp theo
     */
    private void post() {
        System.out.println("post");
        int a = 1;
        // đã tăng lên 2, nhưng ở câu lệnh so sánh và là 1 < 2. Đên câu lệnh tiếp theo thì đã mới là 2
        if (a++ < 2) {
            System.out.println("< 2 "+a );
        } else {
            System.out.println(">= 2 "+a);
        }
    }

    private void pre() {
        System.out.println("pre");
        int a = 1;
        // Cũng tăng tương tự như post. nhưng giá trị của biến sẽ được tăng lên ngay lập tực ở chính câu lệnh hiện tại

        // đã tăng lên 2 và được cập nhật luôn nên 2 < 2 is false
        if (++a < 2) {
            System.out.println("< 2 "+a );
        } else {
            System.out.println(">= 2 "+a);
        }
    }
}
