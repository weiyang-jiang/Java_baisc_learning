package day11.Collection工具类.sort方法;

import day11.Collection工具类.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        ArrayList<person> list = new ArrayList<>();


        list.add(new person("zs", 18));
        list.add(new person("zsda", 20));
        list.add(new person("das", 19));
        list.add(new person("ww", 23));

        System.out.println(list);
        Collections.sort(list);  // 默认是按照升序进行排序
        System.out.println(list);
    }
}
