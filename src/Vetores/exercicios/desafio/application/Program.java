package Vetores.exercicios.desafio.application;

import Vetores.exercicios.desafio.entities.Tenants;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int qnt = sc.nextInt();
        Tenants[] renter = new Tenants[qnt];

        for(int i = 0; i< renter.length; i++){
            sc.nextLine(); // Consumir quebra de linha

            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            renter[i] = new Tenants(name, email, roomNumber);
        }

        Tenants.selectionSort(renter);

        System.out.println("Busy rooms:");
        for(int i = 0; i< renter.length; i++){ // Poderia ser substituído por um enhanced for
            System.out.println(renter[i]);
        }

        sc.close();
    }
}
