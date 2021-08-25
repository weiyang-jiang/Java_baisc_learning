package day16.AIO类.异步非阻塞;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 12:48:00
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.Future;

public class server {
    public static void main(String[] args) throws IOException {
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open();
        assc.bind(new InetSocketAddress(7777));
        // 第一个参数是评论，表示谁调用的， 第二个参数是调用的

        assc.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel asc, Object attachment) {
                System.out.println("成功");
                ByteBuffer b1 = ByteBuffer.allocate(1024);
                asc.read(b1, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        System.out.println(new String(b1.array(), 0, len));
                        try {
                            asc.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {

                    }
                });
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("失败");
            }
        });
    }
}
