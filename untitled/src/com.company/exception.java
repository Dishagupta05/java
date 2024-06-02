package com.company;
class except{
    void check(){
        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("outside try catch"
        );
    }
}

public class exception {
    public static void main(String[] args) {
        except e = new except();
        e.check();

    }
}
