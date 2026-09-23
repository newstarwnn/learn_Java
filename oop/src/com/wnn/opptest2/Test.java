package com.wnn.opptest2;

public class Test {
    public static void main(String[] args) {
        //创建对象记录第一个学生的信息
        Student s1 = new Student();
        s1.name = "张三";
        s1.gender = '男';
        s1.age = 18;
        s1.height = 185;
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.height);
    }
}
