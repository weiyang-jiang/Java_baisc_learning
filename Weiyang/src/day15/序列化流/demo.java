package day15.序列化流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 22:49:23
 */

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        将对象转化为字节就是序列化
        字节转换为对象反序列化
        要求序列化的类必须继承标记接口serializable
        要求里面的类方法和变量也可以序列化
         */
//        method_seriziable();
        final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Weiyang/src/day15/序列化流/a"));
        Object p = objectInputStream.readObject();
        Person1 p_reader = (Person1) p; //强转类型
        System.out.println(p_reader.name);



    }

    private static void method_writer() throws IOException {
        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Weiyang/src/day15/序列化流/a"));
        Person1 p = new Person1("weiyang", 21);
        ois.writeObject(p); // 存入这个对象数据
        ois.close();
    }
}
