package POO.polimorfismo.exercicio.application;

import POO.polimorfismo.exercicio.entities.ImportedProduct;
import POO.polimorfismo.exercicio.entities.Product;
import POO.polimorfismo.exercicio.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consome buffer de leitura

        List<Product> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Product #" + (i+1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine(); // Consome buffer
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(answer == 'c' || answer == 'C'){
             list.add(new Product(name, price));
            } else if(answer == 'u' || answer == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else if(answer == 'i' || answer == 'I'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(int i = 0; i<n; i++){
            System.out.println(list.get(i).priceTag());
        }
        sc.close();;
    }
}
