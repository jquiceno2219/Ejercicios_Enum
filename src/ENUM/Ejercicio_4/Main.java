package ENUM.Ejercicio_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = Double.parseDouble(s.next());
        System.out.println("Enter a bigger number:");
        double num2 = Double.parseDouble(s.next());


        double result = BasicOperations.ADD.calculate(num1, num2);
        System.out.println(result);
    }
}