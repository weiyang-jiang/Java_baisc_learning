package day16.NIO.映射数组;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 21:58:20
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class demo {
    public static void main(String[] args) throws IOException {
        // 小于2GB的文件可以直接映射到数组中，效率十分高
        // 可以获取指定映射模式的Channel "r", 只读模式 "rw", 读写模式
        RandomAccessFile r1 = new RandomAccessFile("Weiyang/src/day16/NIO/Channel学习/img.png", "r");
        RandomAccessFile r2 = new RandomAccessFile("Weiyang/src/day16/NIO/映射数组/img.png", "rw");

        FileChannel c1 = r1.getChannel();
        FileChannel c2 = r2.getChannel();

        long size1 = c1.size();
        MappedByteBuffer map1 = c1.map(FileChannel.MapMode.READ_ONLY, 0, size1);
        MappedByteBuffer map2 = c2.map(FileChannel.MapMode.READ_WRITE, 0, size1);

        for (long i = 0; i < size1; i++) {
            byte b = map1.get();
            map2.put(b);
        }

        c2.close();
        c1.close();
        r2.close();
        r1.close();


    }
}
