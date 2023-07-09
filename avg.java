import java.util.Scanner;
public class avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        float sum=0;
        System.out.println("Enter the number of numbers ");
        n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the numbers ");
        for(int i = 0; i < n; i++ ){
            num[i]=sc.nextInt();
            sum=sum+num[i];
        }
        System.out.println("Average : "+(sum/n));
    }
}
