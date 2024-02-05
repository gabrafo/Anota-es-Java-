package EstruturaSequencial.OperacoesBasicas.Entrada;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    System.out.println("Digite: ");
    x = sc.next();
    System.out.println("Você digitou: " + x);

    int y;
    System.out.println("Digite um número inteiro: ");
    y = sc.nextInt();
    System.out.println("Você digitou: " + y);

    double z;
    System.out.println("Digite um número com ponto flutuante: ");
    z = sc.nextDouble(); // Pega a localidade do sistema (vírgula)
    System.out.println("Você digitou: " + z); // Imprime na localidade independente
    System.out.printf("Você digitou: %.2f%n", z); // Imprime na localidade do sistema

    char a;
    System.out.println("Digite uma letra: ");
    a = sc.next().charAt(0); // Pega o primeiro char
    System.out.println("Você digitou: " + a);

    System.out.println("Dados digitados: ");
    System.out.println(x + " " + y + " " + z + " " + a);

    sc.close();
    }
}
