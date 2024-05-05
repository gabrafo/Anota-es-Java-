package GenericsCollection.exemplo5.application;

import GenericsCollection.exemplo5.entities.Client;

// EQUALS E HASHCODE
public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "mariaantonieta@gmail.com");
        Client c2 = new Client("Maria", "marialucinda@gmail.com");

        String s1 = "Santos";
        String s2 = "Santos";

        String s3 = new String("Santos");
        String s4 = new String("Santos");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // Testa a referência de memória, equals também faz isso caso não seja personalizado
        System.out.println(s1 == s2); // Compilador trata de uma forma diferente literais, comparando seus valores e não só o endereço
        System.out.println(s3 == s4); // Compilador, com o uso de new, não os trata mais de forma diferente, testando a referência de memóri

    }
}