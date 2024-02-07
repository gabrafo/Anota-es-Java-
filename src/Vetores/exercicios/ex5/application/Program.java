package Vetores.exercicios.ex5.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qnt = sc.nextInt();
        int[] vet1 = new int[qnt];
        int[] vet2 = new int[qnt];
        int[] vet3 = new int[qnt];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i< vet1.length; i++){
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i< vet2.length; i++){
            vet2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i< vet2.length; i++){
            System.out.println(vet3[i] = vet1[i] + vet2[i]);
        }

        sc.close();
    }
}
