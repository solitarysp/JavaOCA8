package com.lethanh98.java.learn.oca8.chap3.UnderstandingJavaArrays;

import com.lethanh98.java.learn.oca8.chap3.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
/**
 * KHông nên sử dụng == trong so sánh ==
 */
public class Overview implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface baseInterface = new Overview();
        baseInterface.run();
    }

    @Override
    public void run() {
        example();
        example_CreatingAnArrayOfPrimitives();
        example_MultipleArrays();
        example_CreatingAnArrayWithReferenceVariables();
        example_Matrix();
    }

    private void example_Matrix() {
        log.info(BASE_LOG, "example_Matrix");
        String[] strs = {"d"};
        Object[] objects = strs; // OK vì tất cả class đều exten từ object
        String[] againStrings = (String[]) objects;
        objects[0] = new StringBuilder(); // Không lỗi compiler vì đang là object, nhưng runtime lỗi vì không đúng data type
      //  againStrings[0] = new StringBuilder(); // error compiler
    }

    private void example_CreatingAnArrayWithReferenceVariables() {
        log.info(BASE_LOG, "example_CreatingAnArrayWithReferenceVariables");
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        String[] alias2 = {"cricket", "beetle", "ladybug"};

        log.info("bugs.equals(alias) : {}", bugs.equals(alias)); // true
        log.info("alias.toString() : {}", alias.toString()); // [Ljava.lang.String;@160bc7c
        log.info("bugs.toString() : {}", bugs.toString()); // [Ljava.lang.String;@160bc7c
        log.info("alias2.toString() : {}", alias2.toString()); // [Ljava.lang.String;@160bc7c
        log.info("bugs.equals(alias2) : {}", bugs.equals(alias2)); // false

    }

    private void example_MultipleArrays() {
        log.info(BASE_LOG, "example_MultipleArrays");

        int ids[], types;
        ids = new int[3];// là 1 array
        ids[0] = 1;
        types = 2;// là 1 int

        int ids1[], types1[];
        ids1 = new int[3];// là 1 array
        ids1[0] = 1;
        types1 = new int[3];// là 1 array

        int ids2, types2[];
        ids2 = 1;
        types2 = new int[3];// là 1 int

        int[] ids3, types3;
        ids3 = new int[]{};
        types3 = new int[]{};

    }

    private void example_CreatingAnArrayOfPrimitives() {
        log.info(BASE_LOG, "example_CreatingAnArrayOfPrimitives");
        int[] numbers1 = new int[3];
        log.info("numbers1 [2] {}", numbers1[2]);

        // Khai báo 1 mảng có giá trị lưu là int và gắn 3 phần tử vào
        int[] numbers12 = new int[]{42, 55, 99};
        log.info("numbers12 [2] {}", numbers12[2]);

        // tạo 1 array anonymous. Chúng ta không chỉ định rõ type và size
        int[] numbers3 = {42, 55, 99};
        log.info("numbers3 [2] {}", numbers3[2]);

    }

    private void example() {
        log.info(BASE_LOG, "example");
        byte[] a = new byte[]{};
        char[] b = new char[]{};

        log.info("{}", a.getClass().getName());
        log.info("{}", b.getClass().getName());

    }


}
