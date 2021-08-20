package day03;

public class demo8_day03 {
    public static void main(String[] args){
        double height = 8844430.0;
        int i = 0;
        double current_height = 0.1;
        while (current_height <= height){
            i++;
            current_height = 0.1 * Math.pow(2,i);

        }
        System.out.println("折叠"+i+"次");
    }
}
