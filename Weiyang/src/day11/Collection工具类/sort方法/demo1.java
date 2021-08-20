package day11.Collection工具类.sort方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();


        list.add(new Person("zs", 18));
        list.add(new Person("zsda", 20));
        list.add(new Person("das", 18));
        list.add(new Person("ww", 23));

        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
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
