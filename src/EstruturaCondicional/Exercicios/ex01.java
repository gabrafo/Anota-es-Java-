package EstruturaCondicional.Exercicios;

import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um digito: ");
        int x = sc.nextInt();
        if(x>=0){
            System.out.println("Não negativo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
