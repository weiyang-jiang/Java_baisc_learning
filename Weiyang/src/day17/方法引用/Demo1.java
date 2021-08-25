package day17.方法引用;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 15:29:34
 */

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        // 引用类的成员方法， 类：：成员方法名。
        ArrayList<String> list = new ArrayList<>();
        list.add("姜维洋");
        list.add("zhangsan");
        list.add("nihao");
//        list.stream().map((String name)->{return name.length();}).forEach(System.out::println);
        list.stream().map(String::length).forEach(System.out::println);
    }

    private static void method3() {
        // 对象成员方法引用
        ArrayList<String> list = new ArrayList<>();
        list.add("姜维洋");
        list.add("zhangsan");
        list.add("nihao");
        list.stream().forEach(name-> System.out.println(name));
        list.stream().forEach(System.out::println);
    }

    private static void method2() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("12");
        list1.add("14");
        list1.add("16");

//        list1.stream().map((String str)->{return Integer.parseInt(str);}).forEach(a -> System.out.println(a));
        // 静态方法引用, 类名：：方法名  就可以引用，
        list1.stream().map(Integer::parseInt).forEach(a -> System.out.println(a));
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("姜维洋");
        list.add("zhangsan");
        list.add("nihao");

//        list.stream().map((String name) -> {return new Person_1(name, 18);}).forEach((Person_1 P)->{
//            System.out.println(P);
//        });
        // 类型::new
        list.stream().map(Person_1::new).forEach(p -> System.out.println(p)); // 引用构造方法
    }
}
