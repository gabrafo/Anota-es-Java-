package exercicios.ex1.entities;

public class Product {
    private String name; // Valores só podem ser acessados com o uso de Get e alterados a partir de um Set
    private double price; // Private: Atributo não pode ser acessado por outra classe.
    private int quantity;
    // String name; // Sem o uso de um modificador de acesso, os membros só poderiam ser acessados nas classes do pacote entities.
    // protected String name; // Só pode ser acessado no mesmo pacote, ou em subclasses de pacotes diferentes.
    // public String name; // Pode ser acessado por todas as classes, a não ser que esteja em outro módulo sem exportação de seu pacote atual.


    public Product(){ // Construtor padrão
    }

    public Product(String name, double price, int quantity){ // Declaração de construtor, não tem declaração de tipo de retorno
        // O uso da palavra "this" serve EstruturaRepetitiva.para fazer com que o programa não dê prioridade à variável local, e sim à da classe
        this.name = name; // Variável da classe Product "name" recebe o valor da variável LOCAL "name" do CONSTRUTOR Product
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){ // Sobrecarga do construtor
        this.name = name;
        this.price = price;
        // Declaração de quantity = 0 é opcional
    }

    // Setters e Getters normalmente ficam após os construtores

    public void setName(String name){ // Método de set, EstruturaRepetitiva.para que possa ser feita a alteração de atributos no código principal
        this.name = name;
    }

    public String getName(){ // Método de get, retorna um valor ao usuário
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // O This serve EstruturaRepetitiva.para especificar que se trata do atributo da classe
        // Soma o quantity que veio de argumento ao quantity atributo da classe
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){ // Sobreposição da classe Product com a chamada de um método da classe Object
        return name
                + ", $ "
                + String.format("%.2f", price) // Converte price EstruturaRepetitiva.para que exiba duas casas decimais sempre
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}