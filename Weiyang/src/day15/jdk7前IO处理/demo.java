package day15.jdk7前IO处理;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 11:38:37
 */

import java.io.*;

public class demo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file1 = new File("Weiyang/src/day15/jdk7前IO处理/1.png");
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream("Weiyang/src/day15/jdk7前IO处理/copy.png");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes, 0 , len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fileInputStream != null){
                        fileInputStream.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }
}
