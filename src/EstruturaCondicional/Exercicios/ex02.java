package EstruturaCondicional.Exercicios;

import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um digito: ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
