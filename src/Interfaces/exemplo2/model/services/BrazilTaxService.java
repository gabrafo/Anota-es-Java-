package Interfaces.exemplo2.model.services;

public class BrazilTaxService implements TaxService { // Implementa a interface

    public double tax(double amount){
        if(amount<=100.0){
            return amount * 0.2;
        }
        return amount * 0.15;
    }
}
