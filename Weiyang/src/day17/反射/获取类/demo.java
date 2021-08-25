package day17.反射.获取类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:17:46
 */

import day17.反射.获取类加载器.Student;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射可以获取类的成员变量，成员方法等等所有信息
        Class c1 = Student.class;

        Student stu = new Student();
        Class c2 = stu.getClass();

        Class c3 = Class.forName("day17.反射.获取类加载器.Student");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 类加载时只会加载出一个class对象，所以c1,c2,c3都是一样的。
    }
}
