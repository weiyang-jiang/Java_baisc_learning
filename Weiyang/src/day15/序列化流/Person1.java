package day15.序列化流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 23:19:56
 */

import java.io.Serializable;

public class Person1 implements Serializable { // 这个是一个标记接口，标记此对象可以被序列化
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1() {
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
