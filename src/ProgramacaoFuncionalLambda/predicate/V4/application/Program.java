package ProgramacaoFuncionalLambda.predicate.V4.application;

import ProgramacaoFuncionalLambda.predicate.V4.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        double min = 100.0;

        // Expressão lambda declarada
        // Predicado recebe uma função anônima que recebe o produto p e retorna um
        // booleano que faz o teste com esse produto
        Predicate<Product> pred = p -> p.getPrice()>=min;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}