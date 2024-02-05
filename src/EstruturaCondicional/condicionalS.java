package EstruturaCondicional;

import java.util.Scanner;
public class condicionalS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um digito de 0 a 5: ");
        int x = sc.nextInt();
        if(x>=0 && x<=2) { // 0, 1 e 2
            System.out.println("Bom dia");
        }
        if(x>2 && x<5) { // 3 e 4
            System.out.println("Boa tarde");
        }
        if(x==5) {
            System.out.println("Boa noite");
        }
        if(x>5 || x<0){
            System.out.println("Erro");
        }

        sc.close();
    }
}
