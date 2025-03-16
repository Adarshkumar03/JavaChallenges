package basics;
import java.util.Scanner;

public class Patterns {
    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void patternSelector() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a pattern to print:");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Square");
            System.out.println("3. Pyramid");
            System.out.println("4. Diamond");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the size of the pattern: ");
            int size = sc.nextInt();

            switch (choice) {
                case 1: printTriangle(size); break;
                case 2: printSquare(size); break;
                case 3: printPyramid(size); break;
                case 4: printDiamond(size); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
