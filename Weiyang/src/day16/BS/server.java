package day16.BS;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 17:41:36
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        /*
        1. 创建ServerSocket对象
        2. 调用阻塞方法
        3. 获取输入流
        4. 读取请求信息
        5. 解析数据
        6. 创建字节输入流对象
        7. 循环读取
        8. 在循环中读取数据
        9. 关闭流
         */
        ServerSocket ss = new ServerSocket(9999);
        while (true){
            Socket s = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = s.getInputStream();

                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // 把字节流转换为字符流

                        final BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // 将字符流变为缓冲字符流，为了调用其中的readLine方法

                        String line1 = bufferedReader.readLine();

                        String path = line1.split(" ")[1].substring(1); // 切割字符串

                        System.out.println(path);
                        // 创建一个读取流，将html网页读取到程序上
                        FileInputStream fis = new FileInputStream("Weiyang/src/day16/BS/" + path);
                        // 创建一个输出流，将数据输出到客户端
                        OutputStream outputStream = s.getOutputStream();

                        // 以下表示为请求头，属于http协议
                        outputStream.write("HTTP/1.1 200 OK \n".getBytes());
                        outputStream.write("Content-Type:text/html\n".getBytes());
                        outputStream.write("\n".getBytes());

                        // 这里表示读取一点数据就把他发送到客户端去
                        byte[] bytes = new byte[8192];
                        int len;
                        while ((len = fis.read(bytes)) != -1){
                            outputStream.write(bytes, 0, len);
                        }
                        fis.close();
                        s.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();


        /*
            GET / HTTP/1.1
            Host: 127.0.0.1:9999
            Connection: keep-alive
            sec-ch-ua: "Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92"
            sec-ch-ua-mobile: ?0
            Upgrade-Insecure-Requests: 1
            User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36
            Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*;
            q=0.8,application/signed-exchange;v=b3;q=0.9
                    Sec-Fetch-Site: none
                    Sec-Fetch-Mode: navigate
                    Sec-Fetch-User: ?1
                    Sec-Fetch-Dest: document
                    Accept-Encoding: gzip, deflate, br
                    Accept-Language: zh-CN,zh;q=0.9,en;q=0.8
                */

        }
    }
}
