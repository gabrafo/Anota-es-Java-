package EstruturaSequencial.OperacoesBasicas.Saida;/*
Products:
Computer which price is $ 2100.00
Office desk, which price is $ 650.50

Record: 30 years old, code 5290 and gender: F

Measure with eight decimal places: 53.23456700
Rounded (three decimal places): 53.235
BR: 53,235
 */

import java.util.Locale;

public class ex01
    {
        public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F'; // Aspas simples p/ char, aspas duplas p/ string

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.US);
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2); // Quebra de linha com %n
        System.out.print("\n"); // Quebra de linha com \n
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender); // Duas quebras de linha com %n
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("BR: %f", measure);
    }
}
