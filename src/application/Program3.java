package application;
import java.util.Scanner;
import util.Calculator;

public class Program3 {

    public static void main(String[] args) {


        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the radius : ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Value of the PI: %.2f%n", calc.PI);


    }
}

