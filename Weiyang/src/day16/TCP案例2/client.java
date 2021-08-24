package day16.TCP案例2;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 14:21:42
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        // 先连接服务器
        Socket socket = new Socket("127.0.0.1", 6666);
        // 创建输出流
        OutputStream outputStream = socket.getOutputStream();
        // 写入数据到服务器
        outputStream.write("你好，服务器".getBytes());

        // 关闭socket接口
        byte[] bytes = new byte[1024];
        int len;
        InputStream is = socket.getInputStream();
        len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();
    }
}
