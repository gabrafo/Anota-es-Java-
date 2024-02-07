package Vetores.exercicios.ex8.application;

import Vetores.exercicios.ex8.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int qnt = sc.nextInt(), age;
        Person[] vet = new Person[qnt]; // Declaração do vetor de tipo referência
        String name;

        for(int i = 0; i<vet.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            sc.nextLine(); // Consumir a quebra de linha pendente
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            vet[i] = new Person(name, age); // Inicialização do vetor de tipo referência
        }

        System.out.println("PESSOA MAIS VELHA: " + Person.older(vet));

        sc.close();
    }
}
