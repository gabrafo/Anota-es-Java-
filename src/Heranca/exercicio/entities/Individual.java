package Heranca.exercicio.entities;

public class Individual extends TaxPayer{
    private Double healthCareExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthCareExpenses) {
        super(name, anualIncome);
        this.healthCareExpenses = healthCareExpenses;
    }

    public Double getHealthCareExpenses() {
        return healthCareExpenses;
    }

    public void setHealthCareExpenses(Double healthCareExpenses) {
        this.healthCareExpenses = healthCareExpenses;
    }

    @Override
    public String tax() {
        double taxValue;
        boolean paidForHealthCare = false;
        if(healthCareExpenses>0){
            paidForHealthCare = true;
        }
        if(getAnualIncome()<20000.00){
            if(paidForHealthCare){
                taxValue = getAnualIncome()*0.15-(healthCareExpenses*0.5);
            } else {
                taxValue = getAnualIncome()*0.15;
            }
        } else {
            if(paidForHealthCare){
                taxValue = getAnualIncome()*0.25-(healthCareExpenses*0.5);
            } else {
                taxValue = getAnualIncome()*0.25;
            }
        }
        return String.format("%.2f",taxValue);
    }
}
