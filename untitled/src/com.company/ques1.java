package com.company;
import java.util.Scanner;


public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark of subject1=");
        float sub1 = sc.nextFloat();
        System.out.println("enter mark of subject2=");
        float sub2 = sc.nextFloat();
        System.out.println("enter mark of subject3=");
        float sub3 = sc.nextFloat();
        System.out.println("enter mark of subject4=");
        float sub4 = sc.nextFloat();
        System.out.println("enter mark of subject5=");
        float sub5 = sc.nextFloat();

        float sum = sub1+sub2+sub3+sub4+sub5;
        float per = (sum/500)*100;

        System.out.println("percentage "+ per +"%");


    }
}
