package POO.heranca.exercicio.entities;

public class Company extends TaxPayer{
    private Integer employeesNumber;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String tax() {
        double taxValue;
        if(employeesNumber > 10){
            taxValue = getAnualIncome()*0.14;
        } else {
            taxValue = getAnualIncome()*0.16;
        }

        return String.format("%.2f",taxValue);
    }
}
