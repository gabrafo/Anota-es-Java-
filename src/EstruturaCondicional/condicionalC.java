package EstruturaCondicional;

import java.util.Scanner;
public class condicionalC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("TESTE 1:");
        System.out.println("Quantas horas?");
        if(x<12){
            System.out.println("Bom dia");
        } else if(x<18){
            System.out.println("Boa tarde");
        } else{
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
