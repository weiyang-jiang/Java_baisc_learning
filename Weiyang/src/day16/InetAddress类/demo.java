package day16.InetAddress类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 13:34:30
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机ip地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);

        // 通过主机名获取ip对象
        InetAddress ip2 = InetAddress.getByName("JWY");
        System.out.println(ip2);

        // 获取百度的ip地址对象
        InetAddress ip3 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip3);

        // 通过ip对象获取对应的主机名和ip地址
        final String hostName = ip1.getHostName();
        final String hostAddress = ip1.getHostAddress();
        System.out.println(hostName+":"+hostAddress);
    }
}
