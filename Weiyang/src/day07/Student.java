package day07;

public class Student {
    // 成员属性私有化， 调用该类时不能直接调用这个属性，需要间接的调用
    private int age;
    private String name;

    // 定义了获得属性的方法
    public String getName() {
        return name;
    }

    // 定义了设置属性的方法
    public void setName(String name) {
        this.name = name;
    }

    // 构造方法，初始化类时执行
    public Student() {
    }

    // 构造方法，初始化类时执行， this.age表示该类的age属性，这两个构造就可以让用户选择调用该类时选择初始化哪一个属性
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }


    // 定义了设置年龄的方法
    public void setAge(int age){
        if (age > 0 && age < 120){
            this.age = age;
        }else {
            System.out.println("输入的年龄不合理");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void show(){
        System.out.println(this.name + this.age);
    }
}
