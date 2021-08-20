package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collection_demo {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();

        col.add("范冰冰");
        col.add("dsada");
        col.add("swadd");

        System.out.println(col);

        col.remove("dsada");

        System.out.println(col);

//        col.clear(); // 清空

        boolean res1 = col.contains("范冰冰"); // 是否包含这个元素

        System.out.println(res1);

        col.isEmpty();  // 返回是否是空

        int size = col.size();

        System.out.println(size);

        for (int i = 0; i < size; i++) {

        }

        Object[] arr = col.toArray();
        System.out.println(Arrays.toString(arr));


    }
}
