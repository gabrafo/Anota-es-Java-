package Classes.exercicios.ex4.application;
import Classes.exercicios.ex4.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account; // Declaração da variável account do tipo Account

        int number;
        String holder;
        double depositValue, withdrawValue;

        System.out.print("Enter account number: ");
        number = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha pendente EstruturaRepetitiva.para não atrapalhar o próximo nextLine()
        System.out.print("Enter account holder: ");
        holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        if(resp == 'y' || resp == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            System.out.println(); // Quebra de linha
            account = new Account(number, holder, initialDeposit); // Instanciação da variável com 3 parâmetros
        } else {
            account = new Account(number, holder); // Instanciação da variável com 2 parâmetros
        }

        System.out.println(); // Quebra de linha

        System.out.println("Account data:");
        System.out.println(account); // Não precisa ser account.toString()

        System.out.println(); // Quebra de linha

        System.out.print("Enter deposit value: ");
        depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println(); // Quebra de linha

        System.out.print("Enter a withdraw value: ");
        withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.print(account);

        sc.close();
    }
}
