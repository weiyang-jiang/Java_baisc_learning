package day16.AIO类.同步阻塞;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 12:19:21
 */

import sun.nio.ch.ThreadPool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class server {
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        // 同步接收请求， 同步读取
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open();

        assc.bind(new InetSocketAddress(7777));

        Future<AsynchronousSocketChannel> asc = assc.accept();

        AsynchronousSocketChannel as = asc.get();  // 获取异步对象

        ByteBuffer b1 = ByteBuffer.allocate(1024);

        Future<Integer> future = as.read(b1);

        int len = future.get();

        System.out.println(new String(b1.array(), 0, len));

        as.close();







    }
}
