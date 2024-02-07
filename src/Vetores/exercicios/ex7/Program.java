package Vetores.exercicios.ex7;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.print("Quantos elementos vai ter o vetor? ");
            int qnt = sc.nextInt(), cont = 0;
            int[] vetor = new int[qnt];
            double mediaPares = 0.0;
            for(int i = 0; i<vetor.length;i++){
                System.out.print("Digite um número: ");
                vetor[i] = sc.nextInt();
                if(vetor[i]%2==0) {
                    mediaPares+=vetor[i];
                    cont++;
                }
            }

            System.out.println();

            if(cont>0){
            System.out.println("MÉDIA DOS PARES = " + mediaPares/cont);
            } else {
                System.out.println("NENHUM NÚMERO PAR");
            }
            sc.close();
    }
}
