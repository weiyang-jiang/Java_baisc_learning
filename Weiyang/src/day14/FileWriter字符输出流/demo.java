package day14.FileWriter字符输出流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 09:43:44
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Weiyang/src/day14/aaa/b.txt");
        FileWriter fileWriter1 = new FileWriter(file1, true); // 这里表示清空或者不清空
        fileWriter1.write(98); // 写出一个字符， 二进制表示
        fileWriter1.write("中国"); // 写入一个字符串
        char[] chars = {'a', 'b', 'c'};
        fileWriter1.write(chars); // 写入一个数组
        fileWriter1.write(chars, 0, 2); // 切割数组写入数据
        String[] strs = {"大连","宁波"};
        fileWriter1.write(Arrays.toString(strs));
        fileWriter1.close();
    }
}
