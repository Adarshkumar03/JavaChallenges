package control_flow;

import java.util.Scanner;

public class ControlFlowOps {
    private boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        else if(num % 2 == 0 || num % 3 == 0) return false;
        else {
            for(int i = 3; i * i <= num; i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }

    public int findLargest(int a, int b, int c){
        return (a >= b && a >= c) ? a : (b >= c ? b : c);
    }

    public void printMultiplicationTable(int num){
        System.out.println("Multiplication Table for " + num + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }

    public int sumOfEvenNumbers(){
        int sum = 0, i = 2;
        while(i <= 10){
            sum += i;
            i+=2;
        }
        return sum;
    }

    public void runOperations() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check if a number is prime");
            System.out.println("2. Find the largest among three numbers");
            System.out.println("3. Print a multiplication table");
            System.out.println("4. Calculate sum of even numbers from 1 to 10");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it's prime: ");
                    int num = sc.nextInt();
                    System.out.println(num + (isPrime(num) ? " is a prime number." : " is not a prime number."));
                    break;

                case 2:
                    System.out.print("Enter three numbers to find the largest: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("The largest number is: " + findLargest(a, b, c));
                    break;

                case 3:
                    System.out.print("Enter a number for multiplication table: ");
                    int tableNum = sc.nextInt();
                    printMultiplicationTable(tableNum);
                    break;

                case 4:
                    System.out.println("Sum of even numbers from 1 to 10: " + sumOfEvenNumbers());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

}
