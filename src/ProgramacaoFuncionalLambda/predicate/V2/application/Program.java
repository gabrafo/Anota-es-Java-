package ProgramacaoFuncionalLambda.predicate.V2.application;

import ProgramacaoFuncionalLambda.predicate.V2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Method reference
        // Classe::método
        list.removeIf(Product::staticProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}