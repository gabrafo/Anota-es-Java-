package exercicios.ex3.util;

public class CurrencyConverter {
    public static final double tax = 0.06;
    public static double real(double dollarPrice, double quantity){
        double real = quantity*dollarPrice;
        return real + (real*tax);
    }
}
