package com.neuedu.test1.homework;

public class Rectangle {
    int x;
    int y;
    int a;
    int p;
    Rectangle(int length,int width){
        x = length;
        y = width;
    }
    void getArea(){
        a = x*y;
    }
    void getPer() {
        p = 2 * (x+y);
    }
    void showAll(){
        System.out.println("矩形的长为："+x+"矩形的宽为："+y);
        System.out.println("矩形的面积为："+a);
        System.out.println("矩形的周长为："+p);
    }
}
