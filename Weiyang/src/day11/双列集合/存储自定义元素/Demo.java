package day11.双列集合.存储自定义元素;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<student, String> map = new HashMap<>();

        map.put(new student("zs", 18), "dalian");
        map.put(new student("zs", 18), "sa");

        System.out.println(map);

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();

        TreeMap<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }); // 可以进行排序

    }
}
