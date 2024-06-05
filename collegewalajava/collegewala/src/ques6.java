import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  of i = ");
        int n = sc.nextInt();
        System.out.println("enter the valu of j = ");
        int m = sc.nextInt();
        for(int i = 1 ;i<=n;i++){
            for(int j = i;j<=m;j++){
                System.out.print(j);
            }
            for(int k = 1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.print('\n');
        }
    }
}
