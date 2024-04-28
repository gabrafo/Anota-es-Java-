package Classes.exercicios.ex2.application;
import Classes.exercicios.ex2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: $ ");
        employee.salary = sc.nextDouble();
        System.out.print("Tax: $ ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.print("Updated data: " + employee);


        sc.close();
    }
}
