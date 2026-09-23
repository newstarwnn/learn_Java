package com.wnn.ooptest8;

public class Student {
    //定义一个Javabean类描述学生
    //属性：姓名 年龄 性别 身高
    private String name;//姓名
    private int age;
    private char gender;
    private double height;

    //构造方法！！！习惯：空参和带全部参数的构造方法都写
    //无参的构造方法
    public Student() {
        System.out.println("无参构造方法被调用了~");
    }

    //带全部参数的构造方法
    public Student(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        System.out.println("带全部参数的构造方法被调用了~");
    }

    //set和get方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
}

