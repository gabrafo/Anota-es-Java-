package Enumeracao.ex1.entities;

import Enumeracao.ex1.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // Composição "tem-muitos" não é incluída no construtor

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    private void addContract(HourContract contract){
        contracts.add(contract);
    }

    private void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    private double income(int year, int month){
        double sum = baseSalary;

        for(HourContract c : contracts){
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();

            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
