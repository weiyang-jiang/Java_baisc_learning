package day10;

import java.util.ArrayList;
import java.util.Collection;

public class for_demo {
    public static void main(String[] args) {
        // 增强for循环
        Collection<String> col = new ArrayList<>();

        col.add("dsada");
        col.add("asd");
        col.add("3fghgg");
        col.add("sarew");

        // 内部会创建一个迭代器，然后再进行next方法。
        for (String name: col){
            System.out.println(name);
        }

    }
}
