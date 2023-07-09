import java.util.Scanner;
public class odd_even
	{
	public static void main( String[] args )
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int num = sc.nextInt();
		if ((num % 2) == 0){
			System.out.println("Is even.");}
		else{
			System.out.println("Is odd.");}
		}
	}

