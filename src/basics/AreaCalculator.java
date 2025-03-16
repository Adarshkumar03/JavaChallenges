package basics;
import java.util.Scanner;

public class AreaCalculator {
    private double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    private double calculateArea(double length, double breadth){
        return length*breadth;
    }
    private double calculateArea(double a, double b, double c){
        if(a + b <=  c || b + c <= a || a + c <= b){
            System.out.println("Not a valid triangle ");
            return -1;
        }
        double s = (a+b+c)/2;
        double areaSqr = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(areaSqr);
    }
    public void areaChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1. Circle\n2. Rectangle\n3. Triangle");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("\nEnter radius: ");
                double radius = sc.nextDouble();
                System.out.println("\nArea of circle: " + calculateArea(radius));
                break;
            case 2:
                System.out.println("\nEnter length: ");
                double length = sc.nextDouble();
                System.out.println("\nEnter breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("\nArea of Rectangle: " + calculateArea(length, breadth));
                break;
            case 3:
                System.out.println("\nEnter side a length: ");
                double a  = sc.nextDouble();
                System.out.println("\nEnter side b length: ");
                double b  = sc.nextDouble();
                System.out.println("\nEnter side c length: ");
                double c  = sc.nextDouble();
                double area = calculateArea(a, b, c);
                if(area != -1)
                    System.out.println("\nAre of Triangle: " + area);
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
