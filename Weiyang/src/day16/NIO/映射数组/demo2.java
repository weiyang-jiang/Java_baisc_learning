package day16.NIO.映射数组;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 22:17:47
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class demo2 {
    public static void main(String[] args) throws IOException {
        // 拷贝超大文件2GB以上文件
        RandomAccessFile r1 = new RandomAccessFile("Weiyang/src/day16/NIO/映射数组/1.run", "r");
        RandomAccessFile r2 = new RandomAccessFile("Weiyang/src/day16/NIO/映射数组/1_copy.run", "rw");

        FileChannel c1 = r1.getChannel();
        FileChannel c2 = r2.getChannel();

        long size = c1.size();

        long everysize = 1024*1024*500;

        long count = size % everysize == 0 ? size/everysize:size/everysize+1; // 如果正好能整除那么就是冒号前面， 如果不能的话就是+1的。

        for (long i = 0; i < count; i++) {
            long start = i * everysize;
            long truesize = size - start >= everysize ? everysize : size - start;
            MappedByteBuffer map1 = c1.map(FileChannel.MapMode.READ_ONLY, start, truesize); // 这一步是只读取500MB的数据到内存中，把超过2GB的大文件进行拆分
            MappedByteBuffer map2 = c2.map(FileChannel.MapMode.READ_WRITE, start, truesize);

            for (long l = 0; l < truesize; l++) {
                byte b = map1.get(); // 每一次读取一些数据然后存进map2中去
                map2.put(b);
            }

        }

        c2.close();
        c1.close();
        r2.close();
        r1.close();




    }
}
