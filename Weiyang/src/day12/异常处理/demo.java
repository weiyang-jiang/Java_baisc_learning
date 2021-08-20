package day12.异常处理;

import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Logger;

public class demo {
    public static void main(String[] args) throws ParseException{
        String username = "jiang";
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if (username.equals(s)){
            throw new RegisterException("注册出现异常");
        }else  {
            System.out.println("注册成功");
        }

    }
    // 可以通过不断的抛出异常来传递编译异常。
    public static void method() throws ParseException {
        throw new ParseException("sdad", 10);
    }
}
