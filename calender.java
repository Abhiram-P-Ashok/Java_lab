import java.util.Scanner;
class calender
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("\nMENU\n1 No of days in given month\n2 List the months with 31 days\n3 List the month with 30 days\n4 EXIT");
	System.out.println("Enter the option number : ");
	int op = sc.nextInt();
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	while(op!=4)
		{
			System.out.println("\nMENU\n1 No of days in given month\n2 List the months with 31 days\n3 List the month with 30 days\n4 EXIT");
			System.out.println("Enter the option number : ");
			op = sc.nextInt();
			switch (op)
			{
			case 1 :
				System.out.println("\n1 Jan\n2 Feb\n3 Mar\n4 Apr\n5 May\n6 Jun\n7 Jul\n8 Aug\n9 sep\n10 Oct\n11 Nov\n12 Dec");
				System.out.println("Enter the corresponding month number : ");
				int i = sc.nextInt();
				i=i-1;
				System.out.println("No of days that month is : "+days[i]);
				break;
			case 2 :
					for(i=0; i<12; i++)
					{
						if(days[i]==31)
						{
							System.out.println(month[i]);
						}
					}
					break;
			case 3 :
					for(i=0; i<12; i++)
					{
						if(days[i]==30)
						{
							System.out.println(month[i]);
						}
					}
					break;
			case 4 :
				System.out.println("Exiting....");
				break;
			default : 
				System.out.println("INVALID OPTION!!!");
			}
		}
	}
}	
