import java.util.Scanner;
public class box {
    box(float l, float b, float h){
        float vol = l*b*h;
        System.out.println("Volume : "+vol);
    }
    box(float n){
        float vol = n*n*n;
        System.out.println("Volume : "+vol);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the corresponding number to the box \n1.Cube\n2.Cuboid");
        int op = sc.nextInt();
        if (op==1){
            System.out.print("Enter the size of a side : ");
            float n = sc.nextFloat();
            box obj1 = new box(n);
        }
        else if (op==2){
            System.out.print("Enter the length : ");
            float l = sc.nextFloat();
            System.out.print("Enter the breadth : ");
            float b = sc.nextFloat();
            System.out.print("Enter the height : ");
            float h = sc.nextFloat();
            box obj1 = new box(l,b,h);            
        }
        else{
            System.out.println("INVALID OPTION!!!\n#!ACTION TERMINATED!#");
        }
    }
}
