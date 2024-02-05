import java.util.Scanner;

public class functions {

    public static void main(String[] args) { // Função padrão do entry point do programa, chaves delimitam a função
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert three numbers:");

        int a, b, c, higher;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    // Public = EstruturaRepetitiva.para que a função esteja disponível em outras classes
    // Static = EstruturaRepetitiva.para que a função possa ser chamada sem a criação de um objeto
    public static int max(int x, int y, int z){ // Função de tipo int, obrigatoriamente retorna um número inteiro
        int aux; // Cada função tem seu escopo, então aux é uma variável local
        if(x>y && y>z){
            aux = x;
        } else if(y>z){
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){ // Função do tipo void, não retorna nenhum valor
        System.out.println("Higher = " + value);
    }
}
