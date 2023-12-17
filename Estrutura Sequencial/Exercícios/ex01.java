import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, pi = 3.14159;
        raio = sc.nextDouble();

        System.out.println("ÁREA = " + (pi*Math.pow(raio,2)));

        sc.close();
    }
}
