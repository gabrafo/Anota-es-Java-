package Vetores.exercicios.ex2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int qnt = sc.nextInt();
        double soma = 0.0;
        double[] vetor = new double[qnt];
        for(int i = 0; i<vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();;
            soma+=vetor[i];
        }

        System.out.println();

        System.out.print("VALORES = ");
        for(int i = 0; i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MÉDIA = %.2f%n", soma/ vetor.length);

        sc.close();
    }
}
