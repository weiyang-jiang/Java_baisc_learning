package day13.stream_count;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:11:37
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        // 统计流中元素的个数
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        long num = integerStream.count();

        System.out.println(num);
    }
}
