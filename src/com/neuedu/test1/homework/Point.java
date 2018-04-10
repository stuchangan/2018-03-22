package com.neuedu.test1.homework;

public class Point {
    int x;
    int y;

    Point(){

    }
    Point(int x0,int y0){
        x = x0;
        y = y0;
    }
    void movePoint(int dx,int dy){
            x = x + dx;
            y = y + dy;
    }
}
