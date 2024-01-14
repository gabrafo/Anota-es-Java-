import java.util.Scanner;

public class opTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores e irei imprimir o maior:");
        int x, y, maior;
        x = sc.nextInt();
        y = sc.nextInt();
        maior = (x>y)?x:y;
        System.out.println("O maior é: " + maior);
        sc.close();
    }
}
