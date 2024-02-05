package membros.estaticos.V1;

import java.util.Locale;
import java.util.Scanner;

// VERSION 1

public class Program {

    public static final double PI = 3.14159; // Declaração de membro estático como constante (usa-se CapsLock sempre no nome)
    // public static double Pi = 3.14159;  Declaração de membro estático como variável

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius){ // Como esse método será chamado em uma classe estática (main), ele também tem que ser estático
        return 2*PI*radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius, 3)/3.0;
    }

}
