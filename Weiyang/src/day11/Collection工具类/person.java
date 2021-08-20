package day11.Collection工具类;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 19:40:06
 */

public class person {
    String name;
    int age;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }
}
