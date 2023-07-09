import java.util.Scanner;
public class student {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int count=0,weight[]=new int[10],height[]=new int[10];
    System.out.println("Enter the height and weight according to student number :");
    for(int i=1; i<=10; i++){
        System.out.println("Student : "+i);
        i--;
        System.out.print("Weight : ");
        weight[i] = sc.nextInt();
        System.out.print("Height : ");
        height[i] = sc.nextInt();
        i++;
        }
    for(int i = 0;i<10;i++){
        if(weight[i]>50 && height[i]>160){
            count++;
            }
        }
    System.out.println("No of students with weight greater than 50 and height greater than 160 is "+count);
    }
}
