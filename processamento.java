public class processamento
{
    public static void main(String[] args) {
    int x, y;
    x = 5;
    y = 2*x;
    System.out.println(x + "\n" + y);

    double z;
    z = 2*x;
    System.out.println(x + "\n" + z);

    // Boa prática de programação = sempre usar .0 após números do tipo double, e sempre usar f após números float
    double b, B, h, area;
    b = 6.0;
    B = 8.0;
    h = 5.0;
    area = (B+b)/2.0*h;
    System.out.println(area);

    int c, d;
    double resultado;
    c = 5;
    d = 2;
    resultado = c/d;
    System.out.println(resultado); // Dá 2.0 ao invés de 2.5 por não ser um cálculo entre double ou float
    resultado = (double)c/d; // Casting para double
    System.out.println(resultado);

    double e;
    int f;
    e = 5.7;
    f = (int)e; // Vai haver perda de informações das casas decimais
    System.out.println(f);
    }
}
