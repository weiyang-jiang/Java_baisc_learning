package day13.stream_map;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:29:11
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        // map方法， 将流中的T类型的元素转化为R类型， T和R的类型可以一致也可以不一致。
        integerStream1.map((Integer a)->{return a + 98;}).forEach(a -> System.out.println(a));
        // 遍历修改流中元素
        Stream<String> stringStream1 = Stream.of("18", "19");
        stringStream1.map( str -> Integer.valueOf(str)).forEach(a -> System.out.println(a));
    }
}
