package GenericsCollection.exemplo6.application;

import java.util.HashSet;
import java.util.Set;

// SET
public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // Instanciação de um Set usando HashSet
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.remove("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T'); // Remove todos que começam com a letra T

        System.out.println(set.contains("Notebook")); // Testa se existe o elemento notebook, retornando true ou false

        // HashSet é especialmente indicado em casos que a ordem não importa
        for (String p : set) { // Por se tratar de um HashSet, pode ser que a ordem não esteja correta
            System.out.println(p);
        }
    }
}