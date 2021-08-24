package day15.OutputStreamWriter类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 21:49:09
 */

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
        // 完成转换流的方法
        final InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("Weiyang/src/day15/OutputStreamWriter类/1.txt"), "gbk");
        final OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream("Weiyang/src/day15/OutputStreamWriter类/2.txt"));
        char[] chars = new char[8192];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1){
            gbk.write(chars, 0, len);
        }
        gbk.close();
        inputStreamReader.close();
    }
}
