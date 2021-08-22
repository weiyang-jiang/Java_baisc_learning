package day14.字节输入流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 22:43:20
 */

import java.io.FileInputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        /*
        InputStream 字节输入流， 是一个抽象类
        用来读取数据
         */
        FileInputStream fileInputStream1 = new FileInputStream("Weiyang/src/day14/aaa/b.txt");
//        int read1 = fileInputStream1.read(); // 只能读取单个数据的值，二进制
//        System.out.println((char) read1); // 需要将二进制强转为字符串
//        int read2 = fileInputStream1.read(); // 只能读取单个数据的值，二进制， 读取单个数据是按照顺序读取
//        System.out.println((char) read2); // 需要将二进制强转为字符串
        String str = "";
        while (true){
            int a = fileInputStream1.read();
            if (a == -1){
                break;
            }
            str += (char) a;
        }
        System.out.println(str);
        fileInputStream1.close();
    }
}
