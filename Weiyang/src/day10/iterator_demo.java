package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator_demo {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();

        col.add("dsada");
        col.add("asd");
        col.add("3fghgg");
        col.add("sarew");

        // 迭代

        Iterator<String> iter = col.iterator();
        // 在集合发生迭代的时候不可以进行添加和删除元素
        while (iter.hasNext()){  // 判断是否还有下一个元素
            String data = iter.next();  // 取出下一个元素
        //  col.add("sadads"); // 不可以进行添加元素。
            if (data.equals("asd")) {
                iter.remove();
            }
            System.out.println(data);
        }

        System.out.println(col);
    }
}
