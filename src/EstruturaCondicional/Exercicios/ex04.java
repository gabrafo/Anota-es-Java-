package EstruturaCondicional.Exercicios;

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos você consumiu?");
        int x = sc.nextInt();
        if(x<=100){
            System.out.println("VALOR A PAGAR: R$ 50,00");
        } else {
            System.out.println("VALOR A PAGAR: R$ " + (50+(x-100)*2) + ",00");
        }

        sc.close();
    }
}
