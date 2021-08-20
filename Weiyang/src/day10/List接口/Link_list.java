package day10.List接口;

import java.util.LinkedList;
import java.util.List;

public class Link_list {
    // 继承自List:
    /*
    ArrayList: 查询快，增删慢
    LinkedList: 查询慢， 增删快 （链表存储）
    LinkedList 除了拥有List 和 Collection 集合的方法， 自己还有一些特有的方法。
     */
    public static void main(String[] args) {
        LinkedList<String> link1 = new LinkedList<>();

        link1.add("王宝强");
        link1.add("贾乃亮");
        link1.add("陈羽凡");

        link1.addFirst("dsad");
        link1.addLast("dsad");

        System.out.println(link1);
        String firstE = link1.getFirst();
        String firstL = link1.getLast();

//        String e1 = link1.removeFirst(); // 删除第一个元素

        link1.pop(); // 这个方法是表示在堆栈处弹出一个元素
        System.out.println(link1);


    }



}
