package day14.File常用方法;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 22:31:49
 */

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File file1 = new File("/home/weiyang/图片","2021-07-04 12-58-21 的屏幕截图.png");
        System.out.println(file1.getAbsoluteFile()); // 绝对路径
        System.out.println(file1.getPath()); // 构造路径 就是输入这个文件的路径，不一定是相对路径
        System.out.println(file1.getName());  //获取文件名
        System.out.println(file1.length()); // 获取文件的字节大小

        File file2 = new File("Weiyang/src/day14/File常用方法/a.txt");
        System.out.println(file2.length());

    }

}
