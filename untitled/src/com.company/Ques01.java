package com.company;

class Emplyoee1{
    int salary;
    String name;
    public int getSalary(int salary){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;

    }
}

class cellphone{
    public void ringging(){
        System.out.println("phone is ringing.......");
    }
    public void vibrating(){
        System.out.println("phone is vibrating......");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class Ques01 {
    public static void main(String[] args) {
        int salary =23412;
        String name = "Disha";
        Emplyoee1 emp = new Emplyoee1();
        emp.setName("Harry");
        System.out.println(emp.getName());
        System.out.println(emp.getSalary(salary));


        cellphone cell = new cellphone();
        cell.ringging();
        cell.vibrating();


        square sqr = new square();
        sqr.side = 10;
        System.out.println(sqr.area());
        System.out.println(sqr.perimeter());
    }
}
