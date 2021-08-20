package day11.集合的嵌套;

import java.util.ArrayList;
import java.util.List;

public class demo {
    //List 嵌套 map
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("王宝强1");
        list1.add("王宝强2");
        list1.add("王宝强3");

        List<String> list2 = new ArrayList<>();

        list2.add("ma1");
        list2.add("ma2");
        list2.add("ma3");

        List<List<String>> list = new ArrayList<>();

        list.add(list1);
        list.add(list2);

        for (List<String> l : list) {
            for (String s : l) {
                System.out.println(s);
            }
        }
    }
}
