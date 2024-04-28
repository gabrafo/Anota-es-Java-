package GenericsCollection.exemplo1.model.services;
import GenericsCollection.exemplo1.model.entities.Product;

import java.util.List;

public class CalculationService {

    // Por ser um método estático, não precisa da instanciação da classe CalculationService para ser chamada

    // Método genérico
    public static <T extends Comparable<? super T>> T max(List<T> list) { // Comparable stende qualquer super classe de T e o próprio T
        // Usa-se extends e não implements porque T pode ser uma interface e uma interface não pode implementar outra

        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.getFirst();
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}