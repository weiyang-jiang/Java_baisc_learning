package day15.缓冲流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 16:17:43
 */

import java.io.*;
import java.nio.Buffer;

public class demo {
    // 缓冲流可以高效读写
    public static void main(String[] args) {
        method_bis();
        method_pre();

    }

    private static void method_pre() {
        long start = System.currentTimeMillis();
        try (FileInputStream fileInputStream = new FileInputStream("Weiyang/src/day15/缓冲流/04.zip");
             FileOutputStream fileOutputStream = new FileOutputStream("Weiyang/src/day15/缓冲流/copy2.zip")
        ){
            byte[] bytes = new byte[2];
            while (fileInputStream.read(bytes) != -1){
                fileOutputStream.write(bytes);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println(System.currentTimeMillis()-start);
        }
    }

    private static void method_bis() {
        long start = System.currentTimeMillis();
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("Weiyang/src/day15/缓冲流/04.zip"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Weiyang/src/day15/缓冲流/copy.zip"));
             ){
            byte[] bytes = new byte[2];
            while (bufferedInputStream.read(bytes) != -1){
                bufferedOutputStream.write(bytes);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println(System.currentTimeMillis()-start);
        }
    }
}
