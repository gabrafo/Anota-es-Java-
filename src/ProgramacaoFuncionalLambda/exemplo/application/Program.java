package ProgramacaoFuncionalLambda.exemplo.application;

import ProgramacaoFuncionalLambda.exemplo.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        // Arrow function
        // Interpretador faz inferência de tipos de p1 e p2
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        list.forEach(System.out::println);
    }
}
