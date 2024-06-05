import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
        boolean ans = true;
        int[] arr = new int[]{1,3,2,45,64,65,3};
        for(int i =1 ; i<arr.length ; i++){
            if(arr[i] < arr[i-1]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
