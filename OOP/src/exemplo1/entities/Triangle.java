package exemplo1.entities;

public class Triangle {

    // Declaração dos membros da classe
    public double a; // Atributo do tipo double, o termo "public" permite que a classe seja acessada de outro arquivo
    public double b;
    public double c;

    public double area() {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

