package day13.stream收集数据;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 19:48:38
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5);
        List<Integer> list = integerStream1.collect(Collectors.toList());
        System.out.println(list);

        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5);
        integerStream2 = integerStream2.map(num -> num+1);
        Set<Integer> collect1 = integerStream2.collect(Collectors.toSet());
        System.out.println(collect1);

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        Object[] arr = stream3.toArray();
        System.out.println(Arrays.toString(arr));


    }
}
