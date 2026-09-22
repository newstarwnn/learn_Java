package com.wnn.opptest1;

public class Test {
    public static void main(String[] args) {
        //创建对象，记录第一只狗的信息
        //格式：
        //    类名 对象名 = new 类名（）;

        //创建了一个对象，管理第一只小狗的信息
        Dog d1 = new Dog();

        //赋值
        d1.name = "旺财";
        d1.age = 2;
        d1.weight = 3.5;
        d1.color="白色";

        //获取第一只小狗的信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);

        //创建、赋值、获取第二只小狗的信息
        Dog d2 = new Dog();
        d2.name = "大黄";
        d2.age = 5;
        d2.color = "黄色";
        d2.weight = 4.5;
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);


    }
}
