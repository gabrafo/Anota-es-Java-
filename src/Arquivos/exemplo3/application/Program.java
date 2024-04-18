package Arquivos.exemplo3.application;

// Cria/recria o arquivo: new FileWriter(path)
// Acrescenta ao arquivo existente: new FileWriter(path, true)

// BufferedWriter é mais rápido que o FileWriter

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"}; // Vetor de Strings inicializado
        String path = "/home/gabriel/Área de Trabalho/Java/Anotacoes-Java/src/Arquivos/exemplo3/out.txt";
        
        /* try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ // Cria arquivo
            for(String line : lines){
                bw.write(line); // Escreve no arquivo a cada execução do for:each
                bw.newLine(); // Quebra de linha
            }
        } catch(IOException e){
            e.printStackTrace();
        } */

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // Adiciona info ao arquivo
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
