package POO.heranca.exemplo_abstract.entities;

public final class BusinessAccount extends Account { // Sintaxe de herança
    private Double loanLimit;

    public BusinessAccount(){
        super();
    };

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // Reaproveita atributos da superclasse Account
        this.loanLimit = loanLimit; // Adiciona o novo método na construção
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount<=loanLimit) {
            balance+=amount-10.0; // Balance pode ser alterado em BusinessAccount graças ao uso do modificador "Protected"
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount); // Chama o método da super classe
        balance -= 2.0; // Desconta 2 do saldo
    }
}

