package day15.序列化流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 23:49:24
 */

import day07.Student;

import java.io.*;
import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method1();
        final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Weiyang/src/day15/序列化流/b"));
        final Object o = objectInputStream.readObject();
        objectInputStream.close();
        ArrayList<Person1> list = (ArrayList<Person1>) o; // 强转类型
        for (Person1 person1 : list) {
            System.out.println(person1);
        }
    }

    private static void method1() throws IOException {
        ArrayList<Person1> list = new ArrayList<>();

        Person1 stu1 = new Person1("张三1", 18);
        Person1 stu2 = new Person1("张三2", 18);
        Person1 stu3 = new Person1("张三3", 18);
        Person1 stu4 = new Person1("张三4", 18);
        Person1 stu5 = new Person1("张三5", 18);


        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Weiyang/src/day15/序列化流/b"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }
}
