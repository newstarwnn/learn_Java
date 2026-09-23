package com.wnn.ooptest8;

public class Test {
    public static void main(String[] args) {
        //用构造方法
        //定义一个Javabean类描述学生
        //属性：姓名 年龄 性别 身高

        /*
        构造方法：
        修饰符 类名(参数列表) {
            方法体;
        }

        特点：
        1.构造方法的名称必须和类名完全相同
        2.构造方法没有返回值return，甚至不能写void
        3.没有具体的返回值（不能由return带回结果数据）
        4.构造方法可以重载

        执行时机：
        1.创建对象的时候由虚拟机调用，不能手动调用构造方法
        2.每创建一次对象，就会调用一次构造方法
         */

        //创建对象
        //虚拟机自动调用，不能手动调用，手动调用会报错
        //调用无参构造方法
        Student s1 = new Student();//输出：无参构造方法被调用了~
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());
        System.out.println(s1.getHeight());
        System.out.println("--------------------");
        //调用带全部参数的构造方法
        Student s2 = new Student("张三",18,'男',185);//输出：带全部参数的构造方法被调用了~
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGender());
        System.out.println(s2.getHeight());

        /*
        构造方法注意事项：
        1.如果没有定义构造方法，系统将给出一个默认的无参数构造方法
        2.如果自己写了任意构造方法，系统将不再提供默认的构造方法
        3.带参构造方法和无参数构造方法，两者方法名相同。但是参数不同，这叫做方法的重载
        4.！！！习惯：无论是否使用！！都手动写无参构造方法，和带全部参数的构造方法
         */
    }
}
