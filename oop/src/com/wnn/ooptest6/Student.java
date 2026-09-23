package com.wnn.ooptest6;

public class Student {
    //在校学生有属性：姓名、年龄、身高、体重
    private String name;
    private int age;
    private double height;
    private double weight;

    //针对每一个私有化的成员变量，提供set/get方法
    //姓名的set/get方法
    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    //年龄的set/get方法
    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    //身高的set/get方法
    public void setHeight(double num) {
        height = num;
    }

    public double getHeight() {
        return height;
    }

    //体重的set/get方法
    public void setWeight(double num) {
        weight = num;
    }

    public double getWeight() {
        return weight;
    }

    //行为：学习
    public void study() {
        System.out.println(name + "努力学习~");
    }
}
