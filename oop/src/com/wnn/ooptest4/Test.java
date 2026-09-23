package com.wnn.ooptest4;

public class Test {
    public static void main(String[] args) {
        //创建厨师的对象
        Cook c1=new Cook();

        //赋值
        c1.name="李师傅";
        c1.age =30;
        c1.level=5;

        //获取厨师的属性值并打印在控制台
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.level);

        //调用厨师对象的方法，相当于让厨师去干活
        c1.cooking();
    }
}
