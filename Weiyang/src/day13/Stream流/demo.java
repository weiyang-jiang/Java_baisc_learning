package day13.Stream流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 14:14:06
 */

import java.util.*;
import java.util.stream.Stream;
// stream流分为终结方法和延迟方法

public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1fsdf12");
        list.add("2fsdf44");
        list.add("1fsdf2");
        list.add("5fsdf1");
        /*
        stream流不能重复使用
        stream流不能存储数据
         */
        list.stream().filter(name -> name.startsWith("1")).filter(name -> name.length()==6).forEach(name-> System.out.println(name));
        /*
        可以根据Collection 获取流
         */
        ArrayList<String> list1 = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Stream<String> stream1 = list1.stream();

        Stream<String> stream2 = set.stream();

        //Map集合没有stream流方法，但是可以用他的keyset和value的stream流
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "sad");
        map.put(2, "sad");
        map.put(4, "sad");
        Stream<Integer> stream3 = map.keySet().stream();
        Stream<String> stream4 = map.values().stream();
        Stream<Map.Entry<Integer, String>> stream5 = map.entrySet().stream();
        Integer arr[] = {1, 2, 3};
        Stream<Integer> arr1 = Stream.of(arr);


    }

}
