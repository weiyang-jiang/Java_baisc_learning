package day13.stream_limit;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:21:09
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        // limit需要传入大小，可以对流进行截取，否则不进行操作
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        integerStream1.limit(5).forEach(name -> System.out.println(name));//截取前几个，超过截取范围不会报错，会全部截取。
    }
}
