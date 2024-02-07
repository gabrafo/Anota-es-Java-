package Vetores.exercicios.ex9.application;

import Vetores.exercicios.ex9.entities.Estudant;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantes alunes serão digitades? ");
        int qnt = sc.nextInt();

        double grade1, grade2;
        Estudant[] vet = new Estudant[qnt]; // Declaração do vetor de tipo referência
        String name;

        for(int i = 0; i<vet.length; i++){
            System.out.println("Digite nome, primeira e segunda nota de " + (i+1) + " alune:");
            sc.nextLine(); // Consumir a quebra de linha pendente
            name = sc.nextLine();
            grade1 = sc.nextDouble();
            grade2 = sc.nextDouble();
            vet[i] = new Estudant(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados:");
        Estudant.approval(vet);
    }
}
