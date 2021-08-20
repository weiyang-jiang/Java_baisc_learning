package day10.List接口;

import java.util.ArrayList;
import java.util.List;

public class list_demo {
    public static void main(String[] args) {

        /*
        概述： List接口继承了Collection接口 java.util.List<E>

        特点：
        1. 集合的元素存取有序
        2. 集合的元素可以重复
        3. 集合有索引
         */

        List<String> list = new ArrayList<>();

        list.add("王宝强");
        list.add("贾乃亮");
        list.add("陈羽凡");

        System.out.println(list);

        System.out.println(list.get(0)); //集合中含有索引，可以直接调用get方法

        // 增加了一些带索引的方法

        // 创建list集合对象，限制集合中的元素类型
        list.add(1, "dasd"); // 在指定位置插入一个元素, 按照索引插入

        System.out.println(list);

        list.remove(1); // 返回被删除的元素

        list.set(2, "sdad"); // 替换数据

        System.out.println(list);



    }
}
