package com.neuedu.test1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 18;
        p.name = "李建";
        p.height = 10;
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.height);
        p.drink();
        p.sleep();
    }
}
