package day14.File操作;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 22:21:09
 */

import java.io.File;

public class demo {
    public static void main(String[] args) {
        // 可以表示为file文件夹或者文件路径
        File file1 = new File("/home/weiyang/图片", "2021-07-03 20-11-53 的屏幕截图.png");
        System.out.println(file1);
    }
}
