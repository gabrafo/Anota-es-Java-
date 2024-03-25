package POO.heranca.exercicio.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract String tax(); // Método abstrato a ser sobrescrito pelas classes filhas
}