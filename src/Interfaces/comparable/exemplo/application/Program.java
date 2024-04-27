package Interfaces.comparable.exemplo.application;
import Interfaces.comparable.exemplo.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "/home/gabrafo/Repositórios/Anotacoes-Java/src/Interfaces/comparable/exemplo/application/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCSV = br.readLine();

            // Lê o arquivo
            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }

            Collections.sort(list); // Tipo <T> da lista tem que estender Comparable para que possa haver essa operação

            // Exibe os dados
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}