package Vetores.exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        int i;
        for(i = 0; i < n; ++i) {
            vect[i] = sc.nextDouble();
        }

        for(i = 0; i < n; ++i) {
            sum += vect[i];
        }

        double avg = sum / (double)n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}