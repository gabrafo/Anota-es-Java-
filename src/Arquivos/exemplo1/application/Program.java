package Arquivos.exemplo1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String path = "/home/gabriel/Área de Trabalho/Java/Anotacoes-Java/src/Arquivos/exemplo1/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // Instanciado a partir do FileReader

            String line = br.readLine();

            while (line != null) { // Lê até o arquivo acabar
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
            }
        }
    }
}
