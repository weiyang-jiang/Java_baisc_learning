package day16.NIO.多路复用;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 11:14:43
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class client {
    public static void main(String[] args) throws IOException {
        SocketChannel sc = SocketChannel.open();
        sc.connect(new InetSocketAddress("127.0.0.1",7777));
        ByteBuffer b1 = ByteBuffer.allocate(1024);
        b1.put("你好服务器7777".getBytes());
        b1.flip();
        sc.write(b1);
        sc.close();
    }
}
