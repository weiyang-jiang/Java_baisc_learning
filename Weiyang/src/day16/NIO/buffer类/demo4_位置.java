package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 19:56:37
 */

import java.nio.ByteBuffer;
import java.util.Arrays;

public class demo4_位置 {
    public static void main(String[] args) {
        final ByteBuffer b1 = ByteBuffer.allocate(10);

        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);
        b1.put((byte) 40);

        b1.position(8); // 下一个添加的数据的位置是8
        b1.put((byte) 80);

        System.out.println(Arrays.toString(b1.array()));
    }
}
