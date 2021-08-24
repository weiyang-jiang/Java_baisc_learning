package day15.Commands_io工具包;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 10:25:06
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        // common-io 批量拷贝文件
        FileUtils.copyDirectory(new File("Weiyang/src/day15/Commands_io工具包/aaa"), new File("Weiyang/src/day15/Commands_io工具包/bbb"));
        // 拷贝文件到指定文件夹
        FileUtils.copyFileToDirectory(new File("Weiyang/src/day15/Commands_io工具包/1.png"), new File("Weiyang/src/day15/Commands_io工具包/aaa/5.png"));
    }
}
