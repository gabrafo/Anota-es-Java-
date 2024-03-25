package POO.membros_estaticos.V3.application;
import POO.membros_estaticos.V3.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

// VERSION 3 (membros estáticos)

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();
    }

}
