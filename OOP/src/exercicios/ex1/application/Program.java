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
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity); // Chamada do construtor customizado

        System.out.println(); // P/ pular linha
        System.out.println("Product data: " + product); // Poderia ser também: product.toString()

        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);


        sc.close();
    }
}
