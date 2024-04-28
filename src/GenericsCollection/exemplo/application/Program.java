package GenericsCollection.exemplo.application;

import GenericsCollection.exemplo.model.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values? ");

        PrintService<Integer> ps = new PrintService<>(); // Incializo como <Integer> definindo o tipo do Generics
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
