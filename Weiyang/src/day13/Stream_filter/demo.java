package day13.Stream_filter;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:13:55
 */

import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        /*
        Stream流：将一个流转换为另一个子集流
        判断接口，比较接口
         */
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> integerStream2 = integerStream1.filter(name -> {
            return name > 2;
        }); // 返回值为true的流内值就会放入到流内部
        integerStream2.forEach(name -> System.out.println(name));
    }
}
