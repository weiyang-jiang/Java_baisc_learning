package day19.lombok学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 10:48:05
 */

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data // 生成hashcode， tostring， setter， getter方法
public class student_demo {
    private String name;
    private int age;
}
