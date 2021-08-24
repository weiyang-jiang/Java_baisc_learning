package day16.TCP上传文件案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 14:49:26
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
//        1. 创建ServerSocket 对象
//        2. 调用accept方法，接受客户端的请求
        ServerSocket ss = new ServerSocket(6666);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream("Weiyang/src/day16_网络编程/TCP上传文件案例/bbb/img1.png");
        int len;
        byte[] bytes = new byte[8912];
        while ((len = is.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        fos.close();
        s.close();
//        ss.close();

    }
}
