import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  of i = ");
        int n = sc.nextInt();
        System.out.println("enter the valu of j = ");
        int m = sc.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = 1; j<=m;j++){
                if(i == 0 || i == n || j == 1 || j==m){
                    System.out.print('*');
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}
