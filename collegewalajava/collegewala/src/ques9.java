import java.util.Scanner;


public class ques9 {

    static int findunique(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findunique(arr));

    }
}
