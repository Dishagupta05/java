class welcome {
    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        int c;
        c=a;
        a = b;
        b = c;
        System.out.println("welcome");
        System.out.println("Disha");
        System.out.println("sum of a and b " + (a+b));
        System.out.println("values of a and b " + a + b);

        int a1=23;
        int a2=349;
        int a3=45;
        if(a1>a2 && a1>a3){
            System.out.println(a1);
        }
        if(a2>a1 && a2>a3){
            System.out.println(a2);
        }
        if(a3>a1 && a3>a2){
            System.out.println(a3);
        }
    }
}
