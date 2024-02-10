package Listas.exemplo.application;

import java.util.ArrayList; // Implementação muito otimizada da Lista, por tentar trazê-la mais perto dos vetores
import java.util.List; // Necessário para se trabalhar com Listas
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list; // Declaração da lista (os tipos tem que ser Wrapper Class)
        list = new ArrayList<>(); // Instanciação da lista com uma classe que implementa a interface (ArrayList)

        list.add("Maria"); // Adição de elementos
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Adição na posição 2

        System.out.println("Lista original:");
        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("Tamanho da lista:");
        System.out.println(list.size()); // Mostra tamanho da lista

        System.out.println("----------------");
        System.out.println("Remoção por index (1):");

        list.remove(1);

        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        System.out.println("Lista original:");
        list.add(1, "Alex");

        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        System.out.println("Remoção por comparação de String (Alex):");
        list.remove("Alex");

        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        System.out.println("Lista original:");
        list.add(1, "Alex");

        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        System.out.println("Remoção por predicado (Início M):");
        list.removeIf(x -> x.charAt(0) == 'M'); // Valor lambda, retorna true ou false

        for (String exibicao : list){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Retorna -1, pois não há nenhum Marco na lista

        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Faz uma operação de tipo lambda com a lista, transformando-a em stream para fazer e depois transforma novamente em List
        for (String exibicao : result){
            System.out.println(exibicao);
        }

        System.out.println("----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Tenta achar o primeiro elemento com A, caso não haja, retorna nulo
        System.out.println(name);
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
