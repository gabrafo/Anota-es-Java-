package exercicios.ex1.application;
import exercicios.ex1.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data...");
        System.out.print("Name: ");
        String name = sc.nextLine(); // Variável local que será usada como parâmetro para o construtor
        System.out.print("Price: U$");
        double price = sc.nextDouble();

        Product product = new Product(name, price); // Chamada do construtor customizado

        System.out.println(); // P/ pular linha
        System.out.println("Product data: " + product); // Poderia ser também: product.toString()
        product.setName("Computer"); // Usa um setter para mudar o valor do atributo name
        System.out.println("UPDATED NAME: " + product.getName()); // Uso de getter para exibir o valor do atributo name
        product.setPrice(1200);
        System.out.println("UPDATED PRICE: " + product.getPrice());

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);


        sc.close();
    }
}
