package com.neuedu.test1.homework;

public class Vehicle {
    private String brand;
    private String color;
    private double speed;
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if(speed==0){
            run();
        }else if(speed!=0){
            System.out.println("汽车未启动");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    void run(){
        System.out.println("这款品牌为："+brand+"的"+color+"跑车"+"性能非常nice");
    }
}
