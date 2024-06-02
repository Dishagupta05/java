package com.company;

class MYMainEmployee {
    private int id;
    private String name;
    private int salary;

    public MYMainEmployee(int sal){
        id = 45;
        name = "disha";
        salary = sal;
    }

    public MYMainEmployee(String myname){
        id = 45;
        name = myname;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
    public void setsalary(int sal){
        salary = sal;

    }
    public int getSalary(){
        return salary;
    }

}

public class cunstructor {
    public static void main(String[] args) {
        MYMainEmployee e = new MYMainEmployee("isha");
        MYMainEmployee e1 = new MYMainEmployee(123456);
        System.out.println(e.getid());
        System.out.println(e.getname());
        System.out.println(e1.getid());
        System.out.println(e1.getSalary());

    }
}


