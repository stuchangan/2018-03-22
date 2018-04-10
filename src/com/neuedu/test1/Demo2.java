package com.neuedu.test1;


import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
      /* int[] arr={1,2,3,4,5};
        blsz(arr);*/
      int a;
       a=jdz(-5);
        System.out.println(a);

    }
    /*static void blsz(int[] a){
        int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }*/
    static int jdz(int x){
        return x>=0? x:0-x;
    }
}
