package EstruturaSequencial.OperacoesBasicas.Entrada;

import java.util.Scanner;

public class SecondMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
// Se o usuário digitar o valor de x e usar quebra de linha (enter), o valor do nextLine() mais próximo
// será uma string vazia. Portanto, normalmente, coloca-se um nextLine() não ligado a nenhuma variável antes
// do nextLine() responsável por guardar um valor EstruturaRepetitiva.para que não haja esse problema.

        sc.nextLine(); // Recebe a quebra de linha, ou seja, limpa o buffer de leitura
        s1 = sc.nextLine(); // Faz a leitura até a primeira quebra de linha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: " + "\n" + x + "\n" + s1 + "\n" + s2 + "\n" + s3);

        sc.close();
    }
}
