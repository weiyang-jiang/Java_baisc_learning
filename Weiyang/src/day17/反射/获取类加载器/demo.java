package day17.反射.获取类加载器;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:33:23
 */

public class demo {
    public static void main(String[] args) {
        // 获取类加载器
        System.out.println(Student.class.getClassLoader()); // 这个是appclassloader
        System.out.println(String.class.getClassLoader()); // 这个是引导类加载器，返回null
    }
}
