package exercicios.ex1.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // O This serve para especificar que se trata do atributo da classe
        // Soma o quantity que veio de argumento ao quantity atributo da classe
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){ // Sobreposição da classe Product com a chamada de um método da classe Object
        return name
                + ", $ "
                + String.format("%.2f", price) // Converte price para que exiba duas casas decimais sempre
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}

