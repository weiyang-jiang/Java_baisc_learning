package day16.NIO.SocketChannel连接;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 09:55:23
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(6666));
        SocketChannel sc = ssc.accept();
        ByteBuffer b = ByteBuffer.allocate(1024);

        int len = sc.read(b);

        System.out.println(new String(b.array(), 0, len));

    }
}
