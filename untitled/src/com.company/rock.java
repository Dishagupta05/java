package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock {
    public static void main(String[] args) {
        Random sc = new Random();
        int num = sc.nextInt(3);
        System.out.println(num);
        int num1 = sc.nextInt(3);
        System.out.println(num1);
        int num2 = sc.nextInt(3);
        System.out.println(num2);

        if(num>num1 && num>num2){
            System.out.println("num is winner");
        }

        else if(num1>num && num1>num2){
            System.out.println("num1 is winner");
        }

        else{
            System.out.println("num2 is winner");
        }
    }
}
