package day16.NIO.SocketChannel连接;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 09:53:19
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class client {
    public static void main(String[] args) throws IOException {
        SocketChannel sc = SocketChannel.open();

        sc.connect(new InetSocketAddress("127.0.0.1", 6666));

        ByteBuffer b1 = ByteBuffer.allocate(1024);

        b1.put("你好服务器".getBytes());

        b1.flip(); // 因为下面要写入，写入的是刚刚输入的字符串，所以需要将position变为0,limit变为1.

        int len = sc.write(b1);


    }
}
