package Interfaces.defmethods.model.services;

public class UsaInterestService implements InterestService{
    private final double interestRate=1.0;

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
