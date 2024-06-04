public class ques8 {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        for(int i =0 ;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i]+arr[j]==7){
                    System.out.println("a is %d"+i);
                    System.out.println("b is %d"+j);
                }
            }
        }
    }
}


