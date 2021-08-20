package day14.File常用方法;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 22:58:59
 */

import java.io.File;

public class 判断功能demo {
    public static void main(String[] args) {
        File file1 = new File("Weiyang/src/day14/aaa/a.txt");
        System.out.println(file1.exists()); // 判断是否存在
        System.out.println(file1.isFile()); // 判断是不是文件
        System.out.println(file1.isDirectory()); // 判断是不是文件夹
    }
}
