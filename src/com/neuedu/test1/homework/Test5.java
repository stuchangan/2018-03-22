package com.neuedu.test1.homework;

public class Test5 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",180,160);
        Person p2 = new Person("李四",175,140);
        p1.sayHello(p2);
        p2.sayHello(p1);

    }
}
