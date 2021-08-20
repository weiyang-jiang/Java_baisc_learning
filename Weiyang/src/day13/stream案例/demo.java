package day13.stream案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 18:43:02
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        /*
        需求：
         */
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪气功");

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        // 第一个队伍只要名字为3个字的成员姓名
        one.stream().filter(name -> name.length()==3).forEach(name-> System.out.println(name));

        // 第一个队伍筛选后只要前三个
        one.stream().limit(3).forEach(name-> System.out.println(name));

        // 第二个队伍只要姓张的
        two.stream().filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));

        // 第二个队伍不要前两个人
        two.stream().skip(2).forEach(name-> System.out.println(name));

        // 将两个队伍合并成一个队伍
        Stream.concat(one.stream(), two.stream()).forEach(name-> System.out.println(name));

        // 根据姓名创建Person对象
        Stream.concat(one.stream(), two.stream()).map(name -> {return new Person_stream(name);}).forEach(a -> System.out.println(a.name));

    }
}
