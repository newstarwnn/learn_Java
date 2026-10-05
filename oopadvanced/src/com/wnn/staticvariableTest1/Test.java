package com.wnn.staticvariableTest1;

public class Test {
    public static void main(String[] args) {
        /*
        学生有如下属性：姓名、年龄、老师
        一个班级中，所有学生都是共享一个老师
        第一名学生：小诗诗，19岁
        第二名学生：小丹丹，20岁
        最初都是小雯老师上课，有一天小丹丹申请换老师，换成了小武老师
        利用static模拟上述效果

        关于static关键字需要重点掌握的内容：
        1. 静态变量：被当前类所有的对象共享，不属于对象，属于类
           共享：
           赋值只要赋值一次
           只要有一个对象修改了静态变量，其他对象再次访问的时候就是修改之后的结果了
        2.调用方式：
          方式一：类名调用（推荐）:Student.teacher="小雯";
          方式二：对象名调用:stu1.teacher="小武";(不推荐)
        3.在内存中，静态变量只有一份
          调用结束后不会被销毁，只要虚拟机关闭，静态变量所占用的内存才会被释放
         */
         Student stu1=new Student();
         stu1.name="小诗诗";
         stu1.age=19;
         Student.teacher="小雯老师";
         Student stu2=new Student();

         stu2.name="小丹丹";
         stu2.age=20;
         Student.teacher="小武老师";
         System.out.println(stu1.name+"的老师是："+Student.teacher);
         System.out.println(stu2.name+"的老师是："+Student.teacher);

    }
}
