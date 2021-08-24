package day16.NIO.buffer类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 19:22:26
 */

import java.nio.ByteBuffer;
import java.util.Arrays;

public class demo1_构造方法 {
    public static void main(String[] args) {
        // 在NIO中， 通过Buffer来读写数据，通常使用字节数组
        ByteBuffer allocate1 = ByteBuffer.allocate(9);// 在堆中创建缓冲数组, 变量表示容器大小
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10); // 这个是在系统内存中创建
        ByteBuffer wrap = ByteBuffer.wrap(new byte[8192]); // 包装byte数组。也是存储在堆中
        allocate1.put((byte) 10);
        allocate1.put((byte) 20);
        allocate1.put((byte) 30);

        byte[] byt = {100, 101, 120};
        allocate1.put(byt);

        allocate1.put(byt, 0, 2); // 可以切割传入buffer数组

        byte[] array = allocate1.array();
        System.out.println(Arrays.toString(array));

    }
}
