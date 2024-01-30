package exercicios.ex4.application;

import exercicios.ex4.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice = sc.nextDouble();
        double quantity = sc.nextDouble();
        System.out.printf("%.2f%n", CurrencyConverter.real(dollarPrice, quantity));

        sc.close();
    }
}
