import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 1.0, soma = 0.0;
        System.out.println("Insira o número ZERO para parar a soma.");
        System.out.println("OBS: A soma começará incluindo o valor 1 e depois os números ditos pelo usuário.");

        System.out.println("1,0");

        while(num!=0.0){
            soma+=num;
            num = sc.nextDouble();
        }

        System.out.printf("A soma dos valores inseridos foi: %.2f.%n", soma);

        sc.close();
    }
}
