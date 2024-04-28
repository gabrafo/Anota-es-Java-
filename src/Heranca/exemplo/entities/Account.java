package Heranca.exemplo.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; // Protected faz com que ele possa ser acessado por suas classes filhas

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance-=amount + 5.0;
    }

    public final void deposit(double amount){ // Método não pode ser sobreposto em subclasses (uso de final)
        balance+=amount;
    }
}
