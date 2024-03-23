package POO.polimorfismo.exemplo.entities;

public class OutsourcedEmployee extends Employee{ // Herança
    protected Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override // Sobrescreve o método da super classe
    public Double payment(){
        return super.payment() + (additionalCharge * 1.1);
    }
}