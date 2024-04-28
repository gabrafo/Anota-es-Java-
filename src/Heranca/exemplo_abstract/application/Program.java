package Heranca.exemplo_abstract.application;

import Heranca.exemplo_abstract.entities.Account;
import Heranca.exemplo_abstract.entities.BusinessAccount;
import Heranca.exemplo_abstract.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* public class Program {
    public static void main(String[] args) {
        // Mesmo tipo, diferentes instâncias
        // Account acc1 = new Account(1001, "Alex", 1000.0); Classe Account não pode ser instanciada
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    }
} */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>(); // O tipo da lista será genérico, o que permite a inserção de Business e Savings sem problemas

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0,0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for(Account acc:list){ // Essa operação otimizada só é possível por todos os objetos, mesmo com instâncias diferentes, terem o mesmo tipo
            sum+=acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for(Account acc:list){
            acc.deposit(10.0);
        }


        for(Account acc:list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
