package day16.TCP优化文件上传案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 14:49:26
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
//        1. 创建ServerSocket 对象
//        2. 调用accept方法，接受客户端的请求
        ServerSocket ss = new ServerSocket(6666);
        while (true){
            Socket s = ss.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    FileOutputStream fos = null;
                    try {
                        InputStream is = s.getInputStream();
                        fos = new FileOutputStream("Weiyang/src/day16_网络编程/BS模拟服务器/web.jpg");
                        int len;
                        byte[] bytes = new byte[8912];
                        while ((len = is.read(bytes)) != -1){
                            fos.write(bytes, 0, len);
                        }

                        System.out.println("===========开始发送服务器通知==============");
                        OutputStream outputStream = s.getOutputStream();
                        outputStream.write("上传文件成功".getBytes());

                    }catch (IOException e){
                        e.printStackTrace();
                    }finally {
                        try {
                            if (fos != null){
                                fos.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally {
                            try {
                                s.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }).start();

        }

//        ss.close();

    }
}
