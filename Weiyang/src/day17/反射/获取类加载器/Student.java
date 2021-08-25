package day17.反射.获取类加载器;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:34:07
 */

public class Student {
    public String name;
    public int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void method1(){
        System.out.println("method1");
    }

    private void method2(){
        System.out.println("method2");
    }

    private int method3(int a){
        System.out.println("method3");
        return a;
    }
}
