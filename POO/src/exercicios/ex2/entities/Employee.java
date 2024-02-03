package exercicios.ex2.entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public double netSalary(){
        return salary-tax;
    }

    public void increaseSalary(double percentage){
        percentage/=100;
        double increase = salary*percentage;
        salary -= tax;
        salary += increase;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", salary);
    }
}


