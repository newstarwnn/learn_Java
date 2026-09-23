package com.wnn.ooptest5;

public class Dog {
    //小狗有属性：姓名、年龄
    private String name;
    private int age;

    //set/get方法
    //name
    //value:表示将来要赋的值：小白
    public void setName(String value) {
        //给对象中的属性进行赋值（也可使用this.name=name）
        name = value;
    }

    public String getName() {
        return name;
    }

    //要求1.小狗的年龄：0-15岁
    //set/get方法
    //age
    //num:表示将来要赋的值：2岁
    public void setAge(int num) {
        if (num >= 0 && num <= 15) {
            //给对象中的属性进行赋值（也可使用this.age=age）
            age = num;
        } else {
            System.out.println("当前的" + num + "不在合理范围之内");
        }
    }

    public int getAge() {
        return age;
    }

    //行为：吃骨头
    public void eatbone() {
        System.out.println(age + "岁的" + name + "正在吃骨头");
    }
}
