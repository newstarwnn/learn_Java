package com.wnn.ooptest7;

public class Student {
    private int age;
    public void setAge(int age){
        //传参相当于int age=10;
        //触发就近原则，输出10
        System.out.println(age);//10

        //使用了类的成员变量，输出0
        /*
        int类型当没有赋值时系统默认初始值0
        String类型当没有赋值时系统默认初始值null
        boolean类型当没有赋值时系统默认初始值false
        char类型当没有赋值时系统默认初始值\u0000
        long类型当没有赋值时系统默认初始值0L
        float类型当没有赋值时系统默认初始值0.0
        double类型当没有赋值时系统默认初始值0.0
         */
        System.out.println(this.age);//0
    }
}
