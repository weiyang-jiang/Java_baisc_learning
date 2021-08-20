package day14.File文件的子文件和目录;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 23:26:13
 */

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File file1 = new File("Weiyang/src/day14/aaa");
        String[] list = file1.list(); // 只是获取第一层子文件的名称
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file1.listFiles(); // 获取第一层子目录文件的相对路径
        for (File file : files) {
            System.out.println(file);
        }


    }
}
