import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        int pow = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        for (int i =1;i<=b;i++){
            pow = pow*a;
        }
        System.out.println(pow);
    }
}
