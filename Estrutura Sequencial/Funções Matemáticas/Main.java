
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    A = Math.sqrt(x); // Raíz quadrada
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
    System.out.println("Raíz quadrada de: " + x + "\n" + "Igual a: " + A);
    System.out.println("Raíz quadrada de: " + y + "\n" + "Igual a: " + B);
    System.out.println("Raíz quadrada de 25 é igual a: " + C);
    System.out.print("\n");

    A = Math.pow(x, y); // Potência
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);
    System.out.println(x + " elevado a " + y + " é igual a: " + A);
    System.out.println(x + " elevado ao quadrado é igual a: " + B);
    System.out.println("5 elevado ao quadrado é igual a: " + C);
    System.out.print("\n");

    A = Math.abs(y); // Módulo
    B = Math.abs(z);
    System.out.println("Valor absoluto de: " + y + "\n" + A);
    System.out.println("Valor absoluto de: " + z + "\n" + B);
    System.out.print("\n");

    double a, b, c, delta; // É possível a existência dessas variáveis pois Java é case sensitive e entende que "A" é diferente de "a"
    System.out.println("É possível até mesmo calcular equações de segundo grau com essas funções.");
    System.out.println("4x² - 4x - 24");
    System.out.println("Os coeficientes são: a = 4, b = -4, c= -24");
    a = 4.0;
    b = -4.0;
    c = -24.0;
    delta = Math.pow(b, 2.0) - (4*a*c);
    System.out.println("Delta = " + delta);
    x = (-b + Math.sqrt(delta))/(2.0 * a);
    System.out.println("x1 = " + x);
    x = (-b - Math.sqrt(delta))/(2.0 * a);
    System.out.print("x2 = " + x);

    }
}
