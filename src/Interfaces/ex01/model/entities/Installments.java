package Interfaces.ex01.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
    private LocalDate dueDate;
    private Double amount;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installments() {
    }

    public Installments(LocalDate dueDate, double amount) {
        this.amount = amount;
        this.dueDate = dueDate;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
}
