package EnumeracaoComposicao.ex1.application;

import EnumeracaoComposicao.ex1.entities.Department;
import EnumeracaoComposicao.ex1.entities.HourContract;
import EnumeracaoComposicao.ex1.entities.Worker;
import EnumeracaoComposicao.ex1.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        // Consumir a quebra de linha pendente após o próximo inteiro
        sc.nextLine();

        for(int i = 1; i<=n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateTmp = sc.nextLine();

            try {
                LocalDate date = LocalDate.parse(dateTmp, fmt);
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Duration (hours): ");
                int hours = sc.nextInt();
                HourContract contract = new HourContract(date, valuePerHour, hours);
                worker.addContract(contract);
                sc.nextLine(); // Consume quebra de linha
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in DD/MM/YYYY format.");
                i--;  // Decrementa i para pedir novamente para a mesma iteração
            }

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2)); // Recorta a String monthAndYear e transforma a substring em int
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
