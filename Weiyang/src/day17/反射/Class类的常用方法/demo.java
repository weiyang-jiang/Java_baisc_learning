package day17.反射.Class类的常用方法;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:53:34
 */

import day17.反射.获取类加载器.Student;

public class demo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<Student> c1 = Student.class;

        System.out.println(c1.getSimpleName()); // 获取类名

        String name = c1.getName(); // 全路径

        System.out.println(name);

        Student stu = c1.newInstance(); // 相当于Student stu = new Student();


    }
}
