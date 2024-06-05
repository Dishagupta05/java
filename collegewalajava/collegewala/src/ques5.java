import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  of i = ");
        int n = sc.nextInt();
        System.out.println("enter the valu of j = ");
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1 ;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=2*i-1;k++){
                System.out.print('*');
            }
            System.out.println('\n');
        }

    }
}
