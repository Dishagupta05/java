import java.util.Scanner;

class quess{
    static int[] sortarray(int[] arr,int N){
        int zeroes =0;
        for(int i=0 ; i<N ; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i =0 ;i<N;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
}
class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size =");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        quess.sortarray(arr, N);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}


