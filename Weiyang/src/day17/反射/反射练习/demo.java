package day17.反射.反射练习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 19:47:47
 */

import day17.反射.获取类加载器.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 可以在不清楚类中的成员情况下，可以直接操作该类的所有成员。
        Class<Student> studentClass = Student.class;

        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor); // 获取所有的构造方法、然后就可以创建对象
        }

        Student stu = new Student("张三",18);

        Method[] declaredMethods = studentClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName() == "method1"){
                declaredMethod.invoke(stu); // 如果这个方法等于method1,那么就执行这个方法。
            }
            System.out.println(declaredMethod);

        }


    }
}
