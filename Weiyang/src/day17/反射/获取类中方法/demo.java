package day17.反射.获取类中方法;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 18:06:04
 */

import day17.反射.获取类加载器.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> studentClass = Student.class;

        Method method1 = studentClass.getDeclaredMethod("method1");
        System.out.println(method1);

        Method method2 = studentClass.getDeclaredMethod("method2");
        System.out.println(method2);

        Method method3 = studentClass.getDeclaredMethod("method3", int.class); // 获取到类中的方法
        System.out.println(method3);

        Student stu = new Student();
        method1.invoke(stu);

        method3.setAccessible(true); // 解除私有
        method3.invoke(stu, 1); // method3是私有的，需要解除监察。

    }
}
