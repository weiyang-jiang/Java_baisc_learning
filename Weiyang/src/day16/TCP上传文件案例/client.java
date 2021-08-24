package day16.TCP上传文件案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 14:49:50
 */

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket对象，指定服务器的ip和端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        // 2. 创建字节输入流，将数据读取到程序中
        FileInputStream fis = new FileInputStream("Weiyang/src/day16_网络编程/TCP上传文件案例/aaa/img.png");
        // 3. 创建字节输出流，将读取到程序的数据写入到服务器中
        OutputStream os = socket.getOutputStream();

        int len;
        byte[] bytes = new byte[8192];
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        fis.close();
        socket.close();


    }
}
