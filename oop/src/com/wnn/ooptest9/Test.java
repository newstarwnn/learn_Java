package com.wnn.ooptest9;

public class Test {
    public static void main(String[] args) {

        /*
        定义一个Javabean类描述学生：
        属性：姓名、年龄
        方法：学习、吃饭、睡觉
         */

        //创建对象:用无参构造方法创建
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        //可以写s1.getName().sout然后再回车就能生成以下完整的输出形式了
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.study();
        s1.eat();
        s1.sleep();
        System.out.println("--------------------");
        //创建对象:用有参构造方法创建
        Student s2=new Student("李四",19);
        System.out.println(s2.getName());
        //Ctrl + D 复制当前行到下一行
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        s2.study();
        s2.eat();
        s2.sleep();
    }
}
