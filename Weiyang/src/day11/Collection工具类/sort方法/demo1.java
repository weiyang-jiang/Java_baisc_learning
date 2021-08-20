package day11.Collection工具类.sort方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Person12> list = new ArrayList<>();


        list.add(new Person12("zs", 18));
        list.add(new Person12("zsda", 20));
        list.add(new Person12("das", 18));
        list.add(new Person12("ww", 23));

        System.out.println(list);
        Collections.sort(list, new Comparator<Person12>() {
            @Override
            public int compare(Person12 o1, Person12 o2) {
                if (o1.age == o2.age){
                    return o1.name.length() - o2.name.length();
                }else {
                    return o1.age - o2.age;
                }

            }
        });  // 默认是按照升序进行排序
        System.out.println(list);
    }
}
