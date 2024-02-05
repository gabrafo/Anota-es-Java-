package Vetores.exercicios.ex1.application;

import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int qnt = sc.nextInt();
        int[] vetor = new int[qnt];

        int i;
        for(i = 0; i < vetor.length; ++i) {
            vetor[i] = sc.nextInt();
        }

        for(i = 0; i < vetor.length; ++i) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}