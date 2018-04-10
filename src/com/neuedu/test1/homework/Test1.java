package com.neuedu.test1.homework;

public class Test1 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 5;
        Point p2 = new Point(10,20);
        p1.movePoint(10,10);
        p2.movePoint(-10,-10);
        System.out.println("p1的横坐标为："+p1.x+"p1的纵坐标为："+p1.y);
        System.out.println("p2的横坐标为："+p2.x+"p2的纵坐标为："+p2.y);
    }
}
