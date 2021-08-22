package day14.拷贝图片;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 23:37:16
 */

import java.io.*;

public class demo {

    public static void main(String[] args) throws IOException {
        method2();
        method1();
    }

    private static void method2() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("Weiyang/src/day14/File常用方法/1.png");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("Weiyang/src/day14/aaa/b/1.png");
        byte[] byt = new byte[8192]; // 一般都是8192
        while (fis.read(byt) != -1){
            fos.write(byt);
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    private static void method1() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("Weiyang/src/day14/File常用方法/1.png");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("Weiyang/src/day14/aaa/1.png");
        while (true){
            int read = fis.read();
            if (read == -1){
                break;
            }
            fos.write(read);
        }
        fos.close();
        fis.close();
        System.out.println(System.currentTimeMillis()-start);
    }
}
