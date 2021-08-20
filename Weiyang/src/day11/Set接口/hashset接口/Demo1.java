package day11.Set接口.hashset接口;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("nba");
        set.add("asd");
        set.add("sad");
        set.add("nba");

        System.out.println(set);

        // 定义一个自己的类型存到集合里面
        /*
        存储自定义对象的时候需要自定义hashcode方法和equal方法，add方法就会先判断是否相等然后再进行添加。
         */
        HashSet<student> set1 = new HashSet<>();

        set1.add(new student("sad", 12));
        set1.add(new student("as", 10));
        set1.add(new student("ssdxfad", 213));
        set1.add(new student("sad", 12));

        System.out.println(set1);


        LinkedHashSet<Integer> list = new LinkedHashSet<>(); // 元素存储有序

        list.add(500);
        list.add(200);
        list.add(300);
        list.add(100);
        list.add(400);

        System.out.println(list);

        TreeSet<Integer> tree = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tree.add(1);
        tree.add(12);
        tree.add(23);
        tree.add(34);
        tree.add(11);

        System.out.println(tree);


    }
}
