package EstruturaSequencial.OperacoesBasicas.Saida;

import java.util.Locale; // Importa a classe "Locale"

public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        System.out.println("Olá mundo!");
        System.out.println("O comando System.out.println realiza saída de dados com quebra de linha");
        System.out.println("O valor da variável de tipo inteiro y é: " + y);
        System.out.println("O valor da variável x de tipo double é: " + x);
        System.out.println("Agora, exibindo apenas até sua segunda casa decimal usando vírgula como separador: ");
        System.out.printf("%.2f%n", x); // Printf é EstruturaRepetitiva.para saída de dados FORMATADA
        Locale.setDefault(Locale.US); // Usa, como padrão, o separador dos Estados Unidos, e não do Brasil
        System.out.println("Agora, exibindo apenas até sua quarta casa decimal usando ponto como separador: ");
        System.out.printf("%.4f%n", x); //.4f é o que determina que vai até a quarta casa, %n serve como quebra de linha
        System.out.println("Concatenação com println/print, usando a variável x como exemplo: " + x + " metros"); // "TEXTO1" + VAR + "TEXTO2"
        System.out.printf("Concatenação com printf, usando a variável x como exemplo: %.2f metros%n", x); // "TEXTO1 %F TEXTO2", VAR

        String nome = "Gabriel";
        int idade = 18;
        double renda = 2300.00;
        System.out.printf("%s tem %d anos e ganha R$: %.2f reais%n", nome, idade, renda); // %s = String, %d = int, %f = float/double, %n quebra de linha
        }
    }
