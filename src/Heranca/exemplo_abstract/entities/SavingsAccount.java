package Heranca.exemplo_abstract.entities;

public final class SavingsAccount extends Account { // Uso de final IMPEDE que essa classe seja herdada por outra
    private Double interestRate; // Taxa de juros

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance*interestRate;
    }

    @Override // Anotação que serve de aviso ao compilador que há uma sobreposição de método
    public void withdraw(double amount){ // Sobreposição do método withdraw() da classe Account
        balance-=amount;
    }
}