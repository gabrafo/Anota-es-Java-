package Matrizes.exemplo.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), cont = 0;
        int[][] mat = new int[n][n]; // Declaração de uma matriz bidimensional n por n

        for(int i = 0; i<mat.length; i++){ // mat.length equivale a n
            for(int j = 0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j]<0){
                    cont++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println(); // Quebra de linha

        System.out.print("Quantity of negative numbers = ");
        System.out.println(cont);

        sc.close();
    }
}
