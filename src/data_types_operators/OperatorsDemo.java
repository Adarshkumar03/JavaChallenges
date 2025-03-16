package data_types_operators;
import java.util.Scanner;

public class OperatorsDemo {
    public void demo(){
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        System.out.println("\n--- Relational Operators ---");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));


        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (num1 > 0);
        boolean condition2 = (num2 > 0);

        System.out.println("Both numbers are positive: " + (condition1 && condition2));
        System.out.println("At least one number is positive: " + (condition1 || condition2));
        System.out.println("num1 is NOT positive: " + (!condition1));

        sc.close();
    }
}
