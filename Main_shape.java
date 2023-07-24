import java.util.Scanner;
class Shape{
    float length, breadth, radius;
    Shape(float l,float b){
        length=l;
        breadth=b;
    }
    Shape(float r){
        length=r;
        radius=r;
    }
}
class rect extends Shape{
    rect(float l,float b){
        super(l,b);
    }
    float ractangle_area(){
        return length*breadth;
    }
}
class square extends Shape{
    square(float r){
        super(r);
    }
    float square_area(){
        return length*length;
    }
}
class circle extends Shape{
    circle(float r){
        super(r);
    }
    double circle_area(){
        return 3.14*radius*radius;
    }
}
class Main_shape{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int flag = 0;
            do{
                System.out.println("Select any option\n1.Rectangle\n2.Square\n3.Circle\n4.EXIT");
                flag = sc.nextInt();
                switch(flag){
                    case 1 : 
                        System.out.println("Enter length and breadth :");
                        float l = sc.nextFloat();
                        float b = sc.nextFloat();
                        rect obj1 = new rect(l,b);
                        double vol = obj1.ractangle_area();
                        System.out.println("The volume of Rectangle is "+vol);
                        break;
                    case 2 : 
                        System.out.println("Enter length :");
                        float r = sc.nextFloat();
                        square obj2 = new square(r);
                        vol = obj2.square_area();
                        System.out.println("The volume of Rectangle is "+vol);
                        break;
                    case 3 : 
                        System.out.println("Enter radius :");
                        r = sc.nextFloat();
                        circle obj3 = new circle(r);
                        vol = obj3.circle_area();
                        System.out.println("The volume of Rectangle is "+vol);
                        break;
                }
            }while(flag!=4);
            System.out.println("EXITING!!!!.......");
        }
    }
}