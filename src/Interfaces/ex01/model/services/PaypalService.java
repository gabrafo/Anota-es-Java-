package Interfaces.ex01.model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) { // Taxa de pagamento
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) { // Juros
        return amount*((double) months /100);
    }
}