package com.lethanh98.java.learn.oca8.chap3.StringBuilder;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
public class ImportantStringBuilder implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new ImportantStringBuilder();
        baseInterface.run();
    }

    @Override
    public void run() {
        example_CharAt_IndexOf_Length_Substring();
        example_append();
        example_insert();
        example_deleteAndDeleteCharAt();
        example_reverse();
        example_toString();
    }

    private void example_toString() {
        log.info(BASE_LOG, "example_toString");
        StringBuilder builder = new StringBuilder("LevanThanh1998");
        String s=builder.toString();
        log.info("{}",s);
    }

    private void example_reverse() {
        log.info(BASE_LOG, "example_reverse");
        StringBuilder builder = new StringBuilder("LevanThanh1998");
        log.info("Data: {}", builder.toString());
        builder.reverse();
        log.info("reverse: {}", builder);

    }

    private void example_deleteAndDeleteCharAt() {
        log.info(BASE_LOG, "example_deleteAndDeleteCharAt");
        StringBuilder builder = new StringBuilder("LevanThanh1998");
        log.info("Data: {}", builder);
        // End là vị trí giữ lại
        // Sử dụng để xóa 1 khoảng dữ liệu trong array
        builder.delete(2, 5);
        log.info("delete(2,5): {}", builder);
        // Xóa bị trị index 2 tron mảng
        builder.deleteCharAt(2);
        log.info("deleteCharAt(2): {}", builder);

    }

    private void example_insert() {
        log.info(BASE_LOG, "example_insert");
        StringBuilder builder = new StringBuilder("Le1998");
        // Sử dụng để thêm các ký tự ở bất kỳ vị trí nào trong array
        // Nếu giá trị của char chưa đến index đó thì sẽ bị lỗi
        builder.insert(2, "Thanh");
        log.info("{}", builder);

    }

    private void example_append() {
        log.info(BASE_LOG, "example_append");
        StringBuilder builder = new StringBuilder(1000);
        // Sử dụng append để thêm data vào array char và trả về một ref đến chính StringBuilder builder
        // Nếu truyền vào là một object thì java sẽ sử dụng method toString
        builder.append("LevanThanh").append(1998).append('t').append(true).append(builder);
        log.info("{}", builder);

    }

    private void example_CharAt_IndexOf_Length_Substring() {
        log.info(BASE_LOG, "example_CharAt_IndexOf_Length_Substring");

        StringBuilder builder = new StringBuilder(1000).append("LevanThanh1998");
        // Sử dụng length để lấy về số ký tự tổn tại trong StringBuilder
        log.info("length : {}", builder.length());
        // Sử dụng charAt để lấy về ký tự tồn tại ở index trong array
        log.info("charAt : {}", builder.charAt(1));
        // Tìm kiếm index trong array tồn tại ký tự đầu tiên giống
        log.info("indexOf : {}", builder.indexOf("Thanh"));

        // Giống substring của String và chúng ta nhân về một String
        log.info("substring : {}", builder.substring(5));

    }

}
