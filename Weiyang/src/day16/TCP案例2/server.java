package day16.TCP案例2;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 14:21:34
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        // 模拟聊天，服务器回写数据
        ServerSocket ss = new ServerSocket(6666);

        Socket s = ss.accept();

        byte[] bytes = new byte[1024];
        int len;
        InputStream is = s.getInputStream();
        len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream os = s.getOutputStream();
        os.write("你好，客户端".getBytes());

        s.close();
        ss.close();

    }
}
