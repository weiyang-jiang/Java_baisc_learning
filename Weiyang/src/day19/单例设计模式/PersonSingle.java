package day19.单例设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 08:59:10
 */

public class PersonSingle {
    private PersonSingle(){

    }

    private static final PersonSingle P = new PersonSingle();

    public static PersonSingle getInstance(){
        return P;
    }
}
