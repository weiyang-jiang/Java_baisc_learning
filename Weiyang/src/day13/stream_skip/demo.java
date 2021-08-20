package day13.stream_skip;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:26:35
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        integerStream1.skip(10).forEach(a -> System.out.println(a));
        // 跳过前面几个元素，如果超出范围那么流为空
    }
}
