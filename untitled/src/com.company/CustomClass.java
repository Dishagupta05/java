package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my name is"+id);
        System.out.println("amd name is"+name);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee();
        harry.id=12;
        harry.name="Disha";

        harry.printDetails();

//        System.out.println(harry.id);
//        System.out.println(harry.name);

    }
}
