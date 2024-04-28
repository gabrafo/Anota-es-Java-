package Heranca.exercicio.application;

import Heranca.exercicio.entities.Company;
import Heranca.exercicio.entities.Individual;
import Heranca.exercicio.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(answer == 'i' || answer == 'I'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();
                list.add(new Company(name, anualIncome, employeesNumber));
            }
        }

        System.out.println("TAXES PAID:");
        double totalTaxes = 0;

        for(TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ " + taxPayer.tax());
            totalTaxes += Double.parseDouble(taxPayer.tax());
        }

        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
        sc.close();
    }
}
