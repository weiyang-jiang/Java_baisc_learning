package day15.打印流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 09:22:32
 */

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        java.io.PrintStream继承了OutputStream， 字节输出流，
        void print(任意类型的数据) 不换行打印
        void println() 换行打印
         */
        final PrintStream bufferedOutputStream = new PrintStream(new FileOutputStream("Weiyang/src/day15/打印流/1.txt", true));
//        final PrintStream printStream = new PrintStream("Weiyang/src/day15/打印流/1.txt"); // 这里会将整个文件清空
        bufferedOutputStream.println(10);
        bufferedOutputStream.print(10);
        bufferedOutputStream.print(true); // 将文件作为控制台输出出去。
        bufferedOutputStream.close();

    }
}
