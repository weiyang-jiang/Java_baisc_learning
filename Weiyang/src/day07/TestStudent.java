package day07;

public class TestStudent {
    public static void main(String[] args) {
        // 调用类时执行的命令
        Student student1 = new Student("张三", 23);
//        student1.setAge(23);
        student1.show();
    }
}
