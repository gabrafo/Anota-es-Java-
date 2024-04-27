package Interfaces.defmethods.model.services;

public class BrazilInterestService implements InterestService{
    private final double interestRate=2.0;

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
