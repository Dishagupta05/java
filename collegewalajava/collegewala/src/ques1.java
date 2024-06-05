//find tha sum of following series
//s=1-2+3-4+5-6.....n
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number= ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else{
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
