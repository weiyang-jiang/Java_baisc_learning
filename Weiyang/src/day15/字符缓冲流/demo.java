package day15.字符缓冲流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 17:34:04
 */

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
//        method_bufferedReader();
        BufferedWriter bw = new BufferedWriter(new FileWriter("Weiyang/src/day15/字符缓冲流/b.txt"));
        bw.write("weiyang");
        bw.newLine(); // 换行这个可以解决跨平台的换行问题
        bw.write("哈哈哈哈哈");
        bw.close();
    }

    private static void method_bufferedReader() throws IOException {
        BufferedReader bufferedInputStream = new BufferedReader(new FileReader("Weiyang/src/day15/字符缓冲流/a.txt"));
        String str = "";
        while ((str = bufferedInputStream.readLine()) != null){
            System.out.println(str);
        }
        bufferedInputStream.close();
    }
}
