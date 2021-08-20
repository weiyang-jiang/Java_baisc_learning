package day14.递归文件搜索;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 00:26:18
 */

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class demo {
    static ArrayList<String> strings = new ArrayList<>();
    public static void main(String[] args) {
        // 输出day12中所有文件的绝对路径
        File file1 = new File("Weiyang/src/day12");
        method(file1);
        System.out.println(strings);


    }
    public static void method(File file){
        File[] files = file.listFiles();
        if (files != null){
            for (File file1 : files) {
                method(file1);
            }
        }else {
            String name = file.getAbsolutePath();
            strings.add(name);
        }
    }
}
