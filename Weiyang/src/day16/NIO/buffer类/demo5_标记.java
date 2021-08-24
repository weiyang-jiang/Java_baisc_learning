package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 20:05:51
 */

import java.nio.ByteBuffer;
import java.util.Arrays;

public class demo5_标记 {
    public static void main(String[] args) {
        final ByteBuffer b1 = ByteBuffer.allocate(10);

        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);
        b1.put((byte) 40);

        b1.mark(); // 记录一下当前位置

        b1.put((byte) 30);
        b1.put((byte) 40);

        // 重置
        b1.reset(); // 从刚刚标记的位置开始重新添加数据

        b1.put((byte) 30);
        b1.put((byte) 40);

        System.out.println(Arrays.toString(b1.array()));
    }
}
