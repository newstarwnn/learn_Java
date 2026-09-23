package com.wnn.ooptest9;

public class Student {
    //姓名  年龄
    private String name;
    private int age;

    //构造方法和set/get方法都能用快捷键生成
    //快捷键：alt + (Fn) + insert 出现generate然后选择constructor和setter/getter方法
    //Ctrl + A 全选
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为：学习、吃饭、睡觉！！在Javabean类中的方法不加任何访问修饰符，例如static
    public void study() {
        System.out.println(name + "学习");
    }

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}
