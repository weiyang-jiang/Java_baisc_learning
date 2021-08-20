package day10.案例洗牌发牌;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        /*
        1. 造牌
        2. 洗牌
        3. 发牌
         */
        List<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String [] arr1 = {"红桃", "黑桃", "方片", "梅花"};
        String [] arr2 = {"J", "Q", "K", "A"};

        for (String s : arr1) {
            for (int i = 2; i < 11; i++) {
                poker.add(s + i);
            }
            for (String s1 : arr2) {
                poker.add(s + s1);
            }
        }
        System.out.println(poker);

        Collections.shuffle(poker); //打乱顺序
        System.out.println(poker);

        List<String> gamer1 = new ArrayList<>();
        List<String> gamer2 = new ArrayList<>();
        List<String> gamer3 = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i % 3 == 0){
                gamer1.add(poker.get(i));
            }else if(i % 3 == 1){
                gamer2.add(poker.get(i));
            }else {
                gamer3.add(poker.get(i));
            }
        }

        System.out.println(gamer1);
        System.out.println(gamer2);
        System.out.println(gamer3);
    }
}
