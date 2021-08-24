package day16.TCP通信案例1;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 13:48:02
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo_server {
    public static void main(String[] args) throws IOException {

//        1. 创建ServerSocket对象，指定端口号
        ServerSocket ss = new ServerSocket(6666);
//        2. 调用accept（）方法，等待客户端连接，如果没有客户端连接，该方法就会一直处于阻塞状态
        // 如果客户端连接成功，就会返回一个Socket对象
        Socket socket = ss.accept();
//        3. 读取客户端传送过来的数据
        byte[] bytes = new byte[1024];
        InputStream inputStream = socket.getInputStream();
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
//        4. 关闭对象，开发中一般不关闭。
        socket.close();
        ss.close();


    }
}
