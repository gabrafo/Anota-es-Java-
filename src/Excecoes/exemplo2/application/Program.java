package Excecoes.exemplo2.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try { // Leitura de dados do arquivo .txt
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) { // Caso não haja o arquivo
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed.");
        }
    }
}
