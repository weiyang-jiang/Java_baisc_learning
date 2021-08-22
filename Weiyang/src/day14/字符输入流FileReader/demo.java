package day14.字符输入流FileReader;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 08:58:34
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        // Reader
        /*
        FileReader(File file)
        FileReader(String name)
         */
        method1();
        method2();
        method3();
    }

    private static void method2() throws IOException {
        long start = System.currentTimeMillis();
        FileReader fileReader2 = new FileReader("Weiyang/src/day14/aaa/诗歌.txt");
        char[] chars = new char[8192];
        int len;
        String str = "";
        while ((len = fileReader2.read(chars))!= -1){
            str += new String(chars, 0, len);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void method3() throws IOException {
        long start = System.currentTimeMillis();
        FileReader fileReader2 = new FileReader("Weiyang/src/day14/aaa/诗歌.txt");
        char[] chars = new char[2];
        int len;
        String str = "";
        while ((len = fileReader2.read(chars))!= -1){
            str += new String(chars, 0, len);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    // 表示读取单个数据
    private static void method1() throws IOException {

        File file = new File("Weiyang/src/day14/aaa/b.txt");
        FileReader fileReader1 = new FileReader(file);
        long start = System.currentTimeMillis();
        FileReader fileReader2 = new FileReader("Weiyang/src/day14/aaa/诗歌.txt");
        int read = fileReader1.read(); // 读取单个数据, 文件中有中文不会乱码， 字节流就会出现问题
        String str = "";
        int num;
        while ((num = fileReader2.read()) != -1){
            str += (char) num;
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
