package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 19:48:00
 */

import java.nio.ByteBuffer;

public class demo3_限制 {
    public static void main(String[] args) {
        final ByteBuffer b1 = ByteBuffer.allocate(10);

        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);

        System.out.println(b1.limit()); // 目前还没加限制

        b1.limit(5);

        System.out.println(b1.limit()); // 限制后五个元素无法进行修改（包括添加，删除，更改)

        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);



    }
}
