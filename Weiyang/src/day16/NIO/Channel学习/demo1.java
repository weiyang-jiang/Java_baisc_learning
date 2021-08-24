package day16.NIO.Channel学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 21:44:52
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class demo1 {
    public static void main(String[] args) throws IOException {
        final FileInputStream fileInputStream = new FileInputStream("Weiyang/src/day16/NIO/Channel学习/img.png");
        final FileOutputStream fileOutputStream = new FileOutputStream("Weiyang/src/day16/NIO/Channel学习/copy.png");
        final FileChannel c1 = fileInputStream.getChannel();
        final FileChannel c2 = fileOutputStream.getChannel();

        final ByteBuffer b1 = ByteBuffer.allocate(8192);

        while (c1.read(b1) != -1){
            b1.flip();
            c2.write(b1);
            b1.clear();
        }

        c2.close();
        c1.close();
        fileOutputStream.close();
        fileInputStream.close();


    }
}
