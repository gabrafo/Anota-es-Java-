package POO.membros_estaticos.V2.application;
import POO.membros_estaticos.V2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

// VERSION 2 (com o uso de métodos e objetos INSTANCIADOS)

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

        sc.close();
    }

}
