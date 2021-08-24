package day16.NIO.多路复用;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 10:08:33
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class server {
    public static void main(String[] args) throws IOException {
        // 选择器不用开辟多条线程， 一个选择器可以监听多个端口。
        ServerSocketChannel scc1 = ServerSocketChannel.open();
        scc1.configureBlocking(false); // 需要提前设置通道为非阻塞
        scc1.bind(new InetSocketAddress(6666));

        ServerSocketChannel scc2 = ServerSocketChannel.open();
        scc2.configureBlocking(false); // 需要提前设置通道为非阻塞
        scc2.bind(new InetSocketAddress(7777));

        ServerSocketChannel scc3 = ServerSocketChannel.open();
        scc3.configureBlocking(false); // 需要提前设置通道为非阻塞
        scc3.bind(new InetSocketAddress(8888));

        Selector selector = Selector.open(); // 获取选择器对象
        scc1.register(selector, SelectionKey.OP_ACCEPT); // 将通道注册到选择器上，ssc只能注册OP_ACCEPT。
        scc2.register(selector, SelectionKey.OP_ACCEPT); // 将通道注册到选择器上，ssc只能注册OP_ACCEPT。
        scc3.register(selector, SelectionKey.OP_ACCEPT); // 将通道注册到选择器上，ssc只能注册OP_ACCEPT。

//        Set<SelectionKey> keys = selector.keys(); //获取所有被注册的通道
//        Set<SelectionKey> keySet = selector.selectedKeys(); //获取所有被连接的通道

        // 服务器等待客户端连接方法
        while (true){
            selector.select(); //分情况, 非阻塞了
            System.out.println("连接成功");

            Set<SelectionKey> selectionKeys = selector.selectedKeys(); // 获取所有被连接的通道
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            /*
            因为之前循环的时候会把所有的连接全部都进行操作一遍，就会出现有的端口为6666的连接在识别7777的情况，
            这里利用迭代器，每一次循环时都会先获取指定的通道，然后完成操作之后就会将这个连接从迭代器中剔除， 这样下一次循环的时候就不会出现错误
            操作的情况了。
             */
            while (iterator.hasNext()) {
                SelectionKey next = iterator.next();
                ServerSocketChannel ssc = (ServerSocketChannel)next.channel();  // 需要向下转型一下，转换好通道。
                SocketChannel sc = ssc.accept(); // 接收请求

                ByteBuffer b1 = ByteBuffer.allocate(1024);

                int len = sc.read(b1);

                System.out.println(new String(b1.array(), 0, len));

                sc.close();

                iterator.remove();
            }
        }
    }
}
