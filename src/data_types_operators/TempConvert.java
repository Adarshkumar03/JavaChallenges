package data_types_operators;

import java.util.Scanner;

public class TempConvert {
    public double celsiusToFahrenheit(double cel){
        return (cel*1.8) + 32;
    }
    public double fahrenheitToCelsius(double fah){
        return (fah - 32)/1.8;
    }
    public void tempChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation");
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter temperature in celsius: ");
                double cel = sc.nextDouble();
                System.out.println("Temperature in fahrenheit is: " + celsiusToFahrenheit(cel));
                break;
            case 2:
                System.out.println("Enter temperature in fahrenheit: ");
                double fah = sc.nextDouble();
                System.out.println("Temperature in celsius is: " + celsiusToFahrenheit(fah));
                break;
            default:
                System.out.println("Invalid input");
        }
    }

}
