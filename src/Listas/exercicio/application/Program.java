package Listas.exercicio.application;

import Listas.exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha
        List<Employee> list = new ArrayList<>();
        System.out.println(); // Quebra de linha

        for(int i=0; i<N; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println(); // Quebra de linha
        }

        System.out.print("Enter the employee ID that will have salary increased: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null); // Checa se o ID existe
        if(emp!=null){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This ID doesn't exist!");
        }

        System.out.println(); // Quebra de linha
        System.out.println("List of employees:");

        for (Employee x : list){
            System.out.println(x);
        }

        sc.close();
    }
}
