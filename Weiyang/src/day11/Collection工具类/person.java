package day11.Collection工具类;

public class person implements Comparable<person>{
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(person o){
//        return this.age - o.age; // 这个的意思是 前减后，是属于按照升序排列。
        return o.age - this.age; // 这个的意思是 后减前，是属于按照降序排列。
    }


}
