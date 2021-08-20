package day10.泛型通配符;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        /*
        不知道使用什么类型泛型的具体数据类型，就可以使用？来代替
         */
        // 创建一个集合，限制集合中元素的类型为Object
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        method1(list1);
        method1(list2);
        method1(list3);

    }

    public static void method1(ArrayList<?> list){

    }
}
