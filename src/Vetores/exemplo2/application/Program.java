package Vetores.exemplo2.application;

import Vetores.exemplo2.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        Product[] vect = new Product[n];

        int i;
        for(i = 0; i < vect.length; ++i) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        for(i = 0; i < vect.length; ++i) {
            sum += vect[i].getPrice();
        }

        double avg = sum / (double)vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);
        sc.close();
    }
}
