package Arquivos.exemplo.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("/home/gabriel/Área de Trabalho/Java/Anotacoes-Java/src/Arquivos/exemplo/in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(sc!=null) {
                sc.close(); // É fechado independente de ter ou não exceção
            }
        }

    }
}
