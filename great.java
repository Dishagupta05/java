public class great {
    public static void main(String[] arg){
        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);
        int c = Integer.parseInt(arg[2]);

        if (a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }

    }
}
