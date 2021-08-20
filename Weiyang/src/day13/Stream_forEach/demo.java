package day13.Stream_forEach;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 17:55:40
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        // 对此流的每个元素进行操作
        // consumer消费接口
        List<String> list = new ArrayList<>();
        list.add("1fsdf12");
        list.add("2fsdf44");
        list.add("1fsdf2");
        list.add("5fsdf1");
        Stream<String> stream1 = list.stream();
        // 相当于一个字符串的流，然后可以对数据进行依次操作。
        stream1.forEach(name -> System.out.println(name+1));
    }
}
