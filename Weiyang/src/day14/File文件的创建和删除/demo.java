package day14.File文件的创建和删除;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 23:12:09
 */

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Weiyang/src/day14/aaa/b.txt");
//        if (!file1.exists()){
//            file1.createNewFile(); // 创建文件，如果文件存在就不会创建文件, 如果没有后缀那就是无类型文件
//        }
//        File file2 = new File("Weiyang/src/day14/aaa/bb/aa");
//        file2.mkdir(); // 创建文件夹，只能创建一个文件夹
//        file2.mkdirs(); // 创建不存在的父目录和子文件夹
        file1.delete();//删除文件，如果文件存在删除成功返回true，否则为false


    }
}
