package Vetores.exercicios.ex10.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qnt = sc.nextInt();
        System.out.println(); // Quebra de linha

        double[] vetHight = new double[qnt];
        char[] vetGender = new char[qnt];
        double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE; // Declarando "maior" com um valor muito baixo e "menor" com um valor muito alto
        double mediaF = 0.0;
        int contM = 0, contF = 0;

        for(int i = 0; i<qnt; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            vetHight[i] = sc.nextDouble();

            if(vetHight[i]>maior){
                maior = vetHight[i];
            } else if (vetHight[i]<menor) {
                menor = vetHight[i];
            }

            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            vetGender[i] = sc.next().charAt(0);

            if(vetGender[i]=='F' || vetGender[i]=='f'){
                mediaF+=vetHight[i];
                contF++;
            }
            if (vetGender[i]=='M' || vetGender[i] == 'm'){
                contM++;
            }

            System.out.println(); // Quebra de linha
        }

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaF/contF);
        System.out.println("Número de homens = " + contM);

        sc.close();
    }
}
