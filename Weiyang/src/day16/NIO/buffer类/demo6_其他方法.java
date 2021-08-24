package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 21:15:51
 */

import java.nio.ByteBuffer;

public class demo6_其他方法 {
    public static void main(String[] args) {
        final ByteBuffer b1 = ByteBuffer.allocate(10);

        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);
        b1.put((byte) 40);

        b1.clear(); // 这个方法是还原缓冲区的状态，将position设置为0,将limit还原为capacity，丢弃mark
        b1.flip(); // 这个方法会将limit设置为当前position位置，将当前position位置设为0,并且丢弃mark， 相当于将数组截短了。
    }
}
