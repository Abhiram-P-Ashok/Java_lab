class fibo{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c,n=3;
        System.out.println("1. " + a + "\n2. " + b);
        while (n <= 50){
            c = a + b;
            System.out.println(n + ". " + c);
            a=b;
            b=c;
            n++;
        }
    }
}