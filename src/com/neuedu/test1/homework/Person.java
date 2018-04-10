package com.neuedu.test1.homework;

public class Person {
    String name;
    double height;
    double weight;

    Person(){

    }
    Person(String name1,double height1,double weight1){
        name = name1;
        height = height1;
        weight = weight1;

    }
    void sayHello(Person p){
        System.out.println(p.name + "你好" + "我的名字叫" + name);

    }
}
