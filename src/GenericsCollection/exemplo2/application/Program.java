package GenericsCollection.exemplo2.application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Tipo curinga <?>
        List<Integer> listInt = Arrays.asList(1, 2, 3);
        printList(listInt);

        List<String> listString = Arrays.asList("A", "B", "C");
        printList(listString);
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
