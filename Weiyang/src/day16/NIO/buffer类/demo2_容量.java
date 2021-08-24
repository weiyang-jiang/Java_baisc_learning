package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 19:43:24
 */

import java.nio.ByteBuffer;

public class demo2_容量 {
    public static void main(String[] args) {
        final ByteBuffer b1 = ByteBuffer.allocate(10);
        int capacity = b1.capacity(); // 容量大小
        System.out.println("容量"+capacity);
    }
}
