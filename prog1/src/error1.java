import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "I am tostring()";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"I am getmessage";
    }
}

public class error1 {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is ex");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("yes Finished");
        }
    }
}
