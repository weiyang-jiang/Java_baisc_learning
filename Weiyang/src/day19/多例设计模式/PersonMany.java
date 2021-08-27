package day19.多例设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 09:32:29
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class PersonMany {
    private PersonMany(){

    }

    // 要产生固定数量的类对象
    public static final ArrayList<PersonMany> list = new ArrayList<>();

    static {
        for (int i = 0; i < 3; i++) {
            PersonMany p = new PersonMany();
            list.add(p);
        }
    }

    public static PersonMany getInstance() {
        Random random = new Random();
        int i = random.nextInt(list.size());
        return list.get(i);
    }
}
