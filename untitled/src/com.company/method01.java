package com.company;
import java.util.Scanner;

public class method01 {
    static int logic(int a,int b){
        int z;
        if(a>b){
            z=a-b;
        }
        else
            z=a+b;
        return z;
    }

     int logic1(int a,int b){
        int z;
        if(a>b){
            z=(a-b)*4;
        }
        else
            z=a+b*10;
        return z;
    }

    public static void main(String[] args) {
        int x = 5;   
        int y =6;
        int c;
        c = logic(x,y);
        System.out.println(c);

        method01 obj = new method01();
        int d = obj.logic1(x,y);
        System.out.println(d);
    }
}
