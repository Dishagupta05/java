package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am x base class");
        this.x = x;
    }

    void PrintMe(){
        System.out.println("i m constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inhe {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived c = new Derived();
        c.setY(2);
        c.setX(7);
        System.out.println(c.getX());
        System.out.println(c.getY());

    }
}
