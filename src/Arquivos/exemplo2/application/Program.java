package Arquivos.exemplo2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    // BufferedReader é mais veloz que FileReader
    public static void main(String[] args) {
        String path = "/home/gabriel/Área de Trabalho/Java/Anotacoes-Java/src/Arquivos/exemplo2/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) { // Lê até o arquivo acabar
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}