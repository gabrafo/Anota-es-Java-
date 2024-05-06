package GenericsCollection.exercicio2.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        File path = new File(filePath);

        Map<String, Integer> candidateData = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                // Caso a chave a ser adicionada já exista, adiciona um novo item substituindo o antigo contendo como valor
                // a soma do valor anterior da chave e o valor atual
                if(candidateData.containsKey(fields[0])) {
                    candidateData.put(fields[0], candidateData.get(fields[0]) + Integer.parseInt(fields[1]));
                } else {
                    candidateData.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for(String name : candidateData.keySet()) {
            System.out.println(name + ": " + candidateData.get(name));
        }

        sc.close();
    }
}
