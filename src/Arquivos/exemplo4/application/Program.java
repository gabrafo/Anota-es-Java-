package Arquivos.exemplo4.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); // Caminho de uma pasta

        File[] folders = path.listFiles(File::isDirectory); // Vetor de Files contendo todas as pastas do diretório
        System.out.println("FOLDERS:");

        for(File folder : folders){
            System.out.println(folder);
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile); // Vetor de Files contendo todos os arquivos do diretório
        System.out.println("FILES:");
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir(); // Cria uma pasta chamada subdir a partir da pasta do path
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
