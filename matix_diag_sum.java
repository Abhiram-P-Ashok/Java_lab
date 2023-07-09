import java.util.Scanner;
public class matix_diag_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of sqaure matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the sqaure matrix");
        int i, j, sum=0, mat[][] = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
                if(i==j){
                    sum=sum+mat[i][j];
                }         
            }
        }
        System.out.println("Sum of dialgonal elements is "+sum);
    }
}