package com.company;

abstract class Parents2{
    public Parents2(){
        System.out.println("i am constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void great();
    abstract public void great3();
}


class child2 extends  Parents2{
    @Override
    public void great() {
        System.out.println("Good Morning");
    }
    public void great3(){
        System.out.println("greet3");
    }
}

abstract class child3 extends Parents2{
    public void great2(){
        System.out.println("abstract child");
    }
}



public class abstractc {
    public static void main(String[] args) {
        child2 n = new child2();
    }


}
