package day13.stream_concat;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:41:07
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        // 合并流
        Stream<String> stringStream1 = Stream.of("18", "19");
        Stream<String> stringStream2 = Stream.of("1sda8", "1das9");
        Stream.concat(stringStream1, stringStream2).forEach(name -> System.out.println(name));

    }
}
