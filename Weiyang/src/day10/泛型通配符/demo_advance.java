package day10.泛型通配符;

import java.util.ArrayList;

public class demo_advance {
    public static void main(String[] args) {
        /*
        泛型通配符的高级使用
        泛型通配符的上限： <? extends XXXX>
         */
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();

        method2(list3);
        method2(list1);
//        method2(list2);
        method2(list4);


    }
    public static void method1(ArrayList<? extends Number> list){

    }

    public static void method2(ArrayList<? super Integer> list){

    }
}
