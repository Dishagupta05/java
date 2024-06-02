package com.company;
class except1{
    void method1(){
        int c = 20/0;
        System.out.println(c);
    }
    void method2(){
        method1();
    }
    void method3(){
        method1();
    }
}
public class expect2 {
    public static void main(String[] args) {
        except1 e = new except1();
        try{
            e.method3();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
