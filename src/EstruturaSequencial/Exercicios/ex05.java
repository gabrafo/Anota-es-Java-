package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt","BR"));

        System.out.println("Escreva o código, quantidade de peças e valor unitário de peças do produto: ");

        int cod, qnt;
        double price, total;
        cod = sc.nextInt();
        qnt = sc.nextInt();
        price = sc.nextDouble();
        total = price*qnt;

        System.out.println("Escreva o código, quantidade de peças e valor unitário de peças do produto: ");

        cod = sc.nextInt();
        qnt = sc.nextInt();
        price = sc.nextDouble();
        total += price*qnt;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
