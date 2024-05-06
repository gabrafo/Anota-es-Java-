package GenericsCollection.exemplo7.application;

import java.util.Map;
import java.util.TreeMap;

// MAP
public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>(); // Map<Chave, Valor>
        // TreeMap<> ordena os elementos do Map a partir do equals() e hashCode()

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email"); // Exclui o par com chave "email"
        cookies.put("phone", "99711123"); // Substitui o valor do primeiro "phone", pois não pode repetir chave

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // Retorna true ou false
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // Retorna null, pois o elemento foi removido (não existe mais)
        System.out.println("Size: " + cookies.size()); // Quantidade de valores no Map

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) { // cookies.keySet() faz um Set<> com todas as chaves do Map
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
