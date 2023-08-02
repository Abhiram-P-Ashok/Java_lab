import java.util.Scanner;
class Rectangle{
    static float length;
    static float breadth;
    static void getdata(float l, float b){
        length = l;
        breadth = b;
    }
    static float perimeter(){
        return 2*(length + breadth);
    }
    static float area(){
        return (length*breadth);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        getdata(l,b);
        System.out.println("Perimeter : "+perimeter());
        System.out.println("Area"+area());        
    }
}