package Basics;

import java.util.Scanner;

public class NumberOps {
    public boolean evenOrOdd(int num){
        return (num & 1) == 1;
    }
    public long factorial(int num){
        long res = 1;
        for(int i = 2; i <= num; i++){
           res *= i;
        }
        return res;
    }
    public void printFibonacci(int n){
        int first = 0, second = 1, next;
        System.out.println("\nFibonacci series:\n");
        System.out.println(first + ", " + second);
        for(int i = 3; i <= n; i++){
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
    public void numberChoice(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: ");
        System.out.println("1. Check Even/Odd");
        System.out.println("2. Find factorial");
        System.out.println("3. Print Fibonacci Sequence");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                if(evenOrOdd(num)){
                    System.out.println(num + " is odd.");
                }else{
                    System.out.println(num + " is even.");
                }
                break;
            case 2:
                System.out.print("Enter a number for factorial: ");
                int num2 = sc.nextInt();
                System.out.println("Factorial of " + num2 + " is " + factorial(num2));
                break;
            case 3:
                System.out.print("Enter number of Fibonacci terms: ");
                int n = sc.nextInt();
                printFibonacci(n);
                break;
            default:
                System.out.println("Invalid choice!!");
        }
        sc.close();
    }
}
