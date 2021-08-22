package day14.IO基本操作;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 20:12:23
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        /*
        IO的概述:
            I: Input 输入 从存储设备读取数据到内存中就是输入
            O: output 输出  从内存中写数据到其他存储设备
            FileOutputStream(File file) 输出字节流
            FileOutputStream(String name) 输出字节流
         */




    }
    // 写入字节流
    public static void method1() throws Exception{
        File file1 = new File("Weiyang/src/day14/aaa/a.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1); // 如果文件不存在会自动创建空文件,
        // 如果文件存在，这里会将文件清空

        fileOutputStream1.write(97); // 存入数据，注意存入的是二进制
        fileOutputStream1.flush(); // 刷新数据
    }

    public static void method2() throws Exception{
        FileOutputStream fos = new FileOutputStream("Weiyang/src/day14/aaa/b.txt");
        byte[] bys = {97, 98, 99, 100, 48, 49, 50};
        fos.write(bys); // 存储字节流的数组
        fos.close();
    }

    public static void method3() throws Exception{
        FileOutputStream fos = new FileOutputStream("Weiyang/src/day14/aaa/c.txt");
        byte[] bys = {97, 98, 99, 100, 48, 49, 50};
        fos.write(bys, 1, 3); // 存储字节流的数组 这个划定了数组的范围从1-3.
        fos.close(); // 关闭流释放资源
    }
}
