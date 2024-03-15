package POO.heranca.exemplo.application;

import POO.heranca.exemplo.entities.Account;
import POO.heranca.exemplo.entities.BusinessAccount;
import POO.heranca.exemplo.entities.SavingsAccount;

/*
public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc; // Objeto da subclasse sendo atribuído a um objeto da classe base
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // Do tipo Account, instanciada como SavingsAccount

        // DOWNCASTING
        // BusinessAccount acc4 = acc2; Não é um comando possível, já que a conversão não é natural
        BusinessAccount acc4 = (BusinessAccount) acc2; // Conversão forçada
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3; Essa tentativa de execução é errada, mas só dará erro após compilar

        if(acc3 instanceof BusinessAccount){ // Se acc3 for instanciada como BusinessAccount a operação ocorrerá, caso contrário, não
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.print("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.print("Update!");
        }
    }
}
 */

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account (1001, "Alex", 1000.00);
        acc1.withdraw(200.00); // Empréstimo com taxa
        System.out.println(acc1.getBalance());

        // UPCASTING
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.0); // Empréstimo sem taxa, devido à sobreposição em SavingsAccount()
        System.out.println(acc2.getBalance());
    }
}