package day17.反射.获取类中成员变量;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 19:34:04
 */

import day17.反射.获取类加载器.Student;

import java.lang.reflect.Field;

public class demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Field age = studentClass.getDeclaredField("age");
        Field name = studentClass.getDeclaredField("name");
        Field gender = studentClass.getDeclaredField("gender");

        Student stu = new Student();

        System.out.println(age.getType()); // 获取是什么类型的成员变量

        age.set(stu, 3); // 给变量赋值

        System.out.println(age.get(stu)); // 提取此值

        gender.setAccessible(true);
        gender.set(stu, "男");
        System.out.println(gender.get(stu));

    }
}
