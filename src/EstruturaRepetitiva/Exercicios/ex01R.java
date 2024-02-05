package EstruturaRepetitiva.Exercicios;

import java.util.Scanner;

public class ex01R {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String gab, gab1;
        int cont = 0;

        for(int i = 0; i<10; i++){
            System.out.println("Digite as respostas do gabarito (exemplo: A, B, C, D) e as separe a partir da tecla Enter: ");
            gab = sc.nextLine();
            if(gab.length()!=1){
                System.out.println("Tamanho inválido, insira apenas um caractére.");
                i--;
            } else {
                System.out.println("Questão " + (i+1) + ": " + gab + "\n");
                System.out.println("Agora insira a resposta da mesma questão da aluna Tailane: ");
                gab1 = sc.nextLine();
                String r = gab.toUpperCase(), r1 = gab1.toUpperCase(); // .toUpperCase() faz uma String ter seu conteúdo todo maiúsculo
                if(gab1.length()!=1){ // .length() se refere ao tamanho de uma String
                    System.out.println("Tamanho inválido, insira apenas um caractére.");
                    i--;
                } else {
                    if (r1.equals(r)) { // .equals() compara o conteúdo de duas Strings
                        System.out.println("A aluna acertou a questão!");
                        cont++;
                    } else {
                        System.out.println("A aluna errou a questão.");
                    }
                }
            }
        }

        System.out.println("Tailane acertou " + cont + "/10 da prova.");

        sc.close();
    }
}

/*
Elseif() do C++ e Else If() do Java são diferentes, em C++ não se cria um novo escopo após a declaração do Else, mas
em Java sim. Então, EstruturaRepetitiva.enquanto em C++ posso simplesmente fazer:

    if (gab1.length() != 1) {
        std::cout << "Tamanho inválido, insira apenas um caractere." << std::endl;
        i--;
    } else if (r1 == r) {
        std::cout << "A aluna acertou a questão!" << std::endl;
        cont++;
    } else if (r1 != r) {
        std::cout << "A aluna errou a questão." << std::endl;
    }

Com o segundo else if() representando apenas uma condição diferente da primeira, e o terceiro else if() uma condição
diferente de ambas as anteriores, em Java o else if() cria um novo escopo, considerando que a partir do else há um novo
escopo, onde todas as condições a seguir já estarão sendo avaliadas como diferentes do if() ou else if() anterior.
 */
