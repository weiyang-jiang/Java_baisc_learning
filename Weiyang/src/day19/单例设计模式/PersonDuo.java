package day19.单例设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 09:25:00
 */

public class PersonDuo {
    private PersonDuo(){

    }

    private static PersonDuo p;

    public static synchronized PersonDuo getInstance(){
        if (p == null){
            p = new PersonDuo();
        }
        return p;
    }
}
