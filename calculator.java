import java.util.Scanner;
class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the first operand : ");
        float num1 = sc.nextInt();
        System.out.print("\nEnter the second operand : ");
        float num2 = sc.nextInt();
        System.out.print("\nEnter the operand : ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " =" + (num1%num2));
                break;
        }
    }
}