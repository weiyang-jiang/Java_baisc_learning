package day17.方法引用;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 15:29:49
 */

public class Person_1 {
    String name;
//    int age;

    public Person_1(String name) {
        this.name = name;
//        this.age = age;
    }



    @Override
    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
//                ", age=" + age +
                '}';
    }
}
