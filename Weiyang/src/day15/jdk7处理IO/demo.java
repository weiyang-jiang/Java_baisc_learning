package day15.jdk7处理IO;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 12:28:33
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        // 可以使用try-with-resource 语句， 确保每个资源在语句结束时自动关闭
        // try(创建流对象， 如果有多个就以分号隔开）{}
        try (FileInputStream fileInputStream = new FileInputStream("Weiyang/src/day15/jdk7前IO处理/1.png");
             FileOutputStream fileOutputStream = new FileOutputStream("Weiyang/src/day15/jdk7前IO处理/copy.png");
        ){
            byte[] bytes = new byte[8192];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
