package day17.Base64编码;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 15:50:42
 */

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class demo {
    public static void main(String[] args) {
        // 获取编码器
        Base64.Encoder encoder = Base64.getEncoder(); // 这个编码器编码范围为A-Za-z0-9+/
        String str = "name";
        String s = encoder.encodeToString(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(s);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] data = decoder.decode(s);
        System.out.println(new String(data));

        Base64.Encoder urlEncoder = Base64.getUrlEncoder(); // 这个编码器编码范围为A-Za-z0-9+_
        Base64.Encoder mimeEncoder = Base64.getMimeEncoder(); // 这个编码器编码每一行不超过76个字符，会加上/r/n换行.

    }
}
