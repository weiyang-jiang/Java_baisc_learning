package day16.TCP通信案例1;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 13:51:25
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class demo_client {
    public static void main(String[] args) throws IOException {
        /*
        三次握手
         */
        // 要写服务器所在电脑的ip地址
        Socket socket = new Socket("127.0.0.1", 6666);
        OutputStream os = socket.getOutputStream();
        os.write("你好，服务器".getBytes());
        socket.close();

    }
}
