package com.neuedu.test1.homework;

public class Test4 {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("张三",1001,90);
        s[1] = new Student("李四",1002,100);
        s[2] = new Student("王五",1003,60);
        s[3] = new Student("赵六",1004,80);
        order(s);
    }
    static void order(Student[] s){
       for(int i = 0;i<s.length;i++){
           for(int j =0;j<s.length-1-i;j++){
               if(s[j].score<s[j+1].score){
                   Student n=s[j];
                   s[j] = s[j+1];
                   s[j+1]=n;

               }

           }

       }
        for (int a = 0; a < s.length; a++) {
            System.out.println(s[a].name+" "+s[a].id+" "+s[a].score);
        }


    }
}
