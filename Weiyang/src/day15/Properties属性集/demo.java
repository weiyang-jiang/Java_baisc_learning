package day15.Properties属性集;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 12:43:56
 */

import java.util.Properties;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        /*
        Properties 可以当做Map使用
        可以结合流来加载配置文件（也就是读取配置文件的数据到内存中）
        Properties存储数据是按照键值对的形式存储
         */
        Properties pro = new Properties();
//        pro.put(1, "weiyang");
//        pro.put(2, "jiang");
        pro.setProperty("1", "weiyang"); // 相当于Map中的put方法，只不过只能传入String格式
        System.out.println(pro);

        Set<String> keys = pro.stringPropertyNames();

        for (String key : keys) {
            String property = pro.getProperty(key);
            System.out.println(key);
            System.out.println(property);
        }
    }
}
