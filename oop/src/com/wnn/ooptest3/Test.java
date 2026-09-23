package com.wnn.ooptest3;

public class Test {
    public static void main(String[] args) {
        //创建老师的对象
        Teacher t1 = new Teacher();
        //给老师对象的成员变量赋值
        t1.name = "小芳";
        t1.age = 26;
        //获取老师的信息并打印在控制台上
        System.out.println(t1.name);
        System.out.println(t1.age);
        //调用老师对象的方法，相当于让老师去干活
        //调用老师对象的teach方法
        t1.teach();
        //调用老师对象的eat方法
        t1.eat();
        //调用老师对象的sleep方法
        t1.sleep();
    }
}
