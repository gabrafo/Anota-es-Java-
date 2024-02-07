package Vetores.exercicios.ex6;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int qnt = sc.nextInt();
        double soma = 0.0, media;
        double[] vetor = new double[qnt];
        for(int i = 0; i<vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma+=vetor[i];
        }

        System.out.println();

        media = soma/vetor.length;
        System.out.println("MÉDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for(int i = 0; i<vetor.length;i++){
            if(vetor[i]<media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
