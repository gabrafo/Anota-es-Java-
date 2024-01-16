import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vzs = sc.nextInt(), num, soma = 0;
        for(int i = 0; i<vzs; i++){
        num = sc.nextInt();
        soma += num;
        }
        System.out.println(soma);
        sc.close();
    }
}

// FOR: Número já delimitado de repetições.
// WHILE: Não se sabe quantas repetições serão feitas até que a condição seja saciada.
