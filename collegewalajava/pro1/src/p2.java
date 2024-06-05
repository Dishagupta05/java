import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        int count = 0;
        int sum=0;
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){

            sum+=num%10;
            count = count+1;
            num=num/10;
        }
        System.out.println(count);
        System.out.println(sum);
    }


}