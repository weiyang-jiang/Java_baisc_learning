package day17.注解.自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 22:37:22
 */
@Target(value = {ElementType.FIELD, ElementType.METHOD}) // 定义可以给什么样的数据加注释, elementtype是属性方法。
@Retention(value = RetentionPolicy.RUNTIME) // 这个是指将数据保留到哪一个阶段，
/*
SOURCE 是源码阶段
CLASS 是源码和字节码阶段
RUNTIME 是所有阶段
 */
public @interface MyAnnotation1 {
    String str();
    int num(); // 定义属性类型 数据类型 属性名（）


}
