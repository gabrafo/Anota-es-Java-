package Excecoes.exercicio.model.entities;

import Excecoes.exemplo3.V3.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        if(balance<0){
            throw new DomainException("Initial balance must be a non-negative value."); // Mensagem da exceção
            // Lança exceção para ser tratada no programa principal
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance+=amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if(balance<amount){
            throw new DomainException("Not enough balance.");
        }
        if(amount>withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit.");
        }
        balance-=amount;
    }
}
