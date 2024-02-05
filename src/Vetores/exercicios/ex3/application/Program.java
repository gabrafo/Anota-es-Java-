package Vetores.exercicios.ex3.application;

import Vetores.exercicios.ex3.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        String name;
        final int n = sc.nextInt(); // Declaração de n como constante para que ela não possa ser mudada futuramente
        int age, cont = 0;
        double hight, totalHight = 0;
        Person[] vet = new Person[n]; // Declaração do vetor de tipo referência (Person)
        String[] vetName = new String[n];

        for(int i = 0; i< vet.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            sc.nextLine(); // Pegar a quebra de linha
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            if(age<16){
                vetName[cont] = name;
                cont++;
            }
            System.out.print("Altura: ");
            hight = sc.nextDouble();

            vet[i] = new Person(name, age, hight); // Chamada do construtor para cada um dos elementos do vetor, para que sejam criados objetos para cada um deles
            totalHight += vet[i].getHight();

            System.out.println(); // Pular linha
        }

        System.out.printf("Altura média: %.2f%n", new Person().avgHight(totalHight, n)); // Essa instância de Person é recolhida pelo garbage collector logo após ser utilizada
        new Person().percentage(cont, n, vetName);

        sc.close();
    }
}
