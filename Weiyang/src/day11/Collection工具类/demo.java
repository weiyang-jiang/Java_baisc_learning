package day11.Collection工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        /*
        shuffle 打乱集合顺序 必须是List类型

        sort 将集合中的元素按照默认规则排序
        可以通过规则排序
         */

        ArrayList<person> list = new ArrayList<>();


        list.add(new person("zs", 18));
        list.add(new person("zsda", 20));
        list.add(new person("das", 19));
        list.add(new person("ww", 23));

        System.out.println(list);
        Collections.sort(list, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.age - o2.age;
            }
        }); // 默认是按照升序进行排序
        System.out.println(list);
    }

}
