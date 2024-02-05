package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the employee number, their hours worked and how much they earn per hour: ");

        int num, hr;
        double payment;
        num = sc.nextInt();
        hr = sc.nextInt();
        payment = sc.nextDouble();

        System.out.println("NUMBER = " + num + "\n" + "SALARY = U$ " + (payment*hr));

        sc.close();
    }
}
