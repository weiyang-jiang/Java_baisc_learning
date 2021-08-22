package day14.读取多个字节数据;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 23:16:15
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Weiyang/src/day14/aaa/b.txt");

        byte[] bys = new byte[2]; // 一般要写8192
//        int len = fis.read(bys); // 返回字节个数,数据全部存到了数组当中
//        System.out.println(new String(bys, 0 ,len)); // 这个方法可以将数组中的数据转化为字符串然后进行拼接
        String str = "";
        while (true){
            int len = fis.read(bys);
            if (len <= 0){
                break;
            }
            str += new String(bys, 0, len); // 因为有时候无法读取满数组，那么就需要传入长度.
        }
        fis.close();
        System.out.println(str);
    }
}
