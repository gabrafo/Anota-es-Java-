package Arquivos.exercicio.application;

import Arquivos.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String pathIn = "C:\\Users\\Gabriel\\Desktop\\Anotacoes-Java\\src\\Arquivos\\exercicio\\in.csv";
        String pathOut = "C:\\Users\\Gabriel\\Desktop\\Anotacoes-Java\\src\\Arquivos\\exercicio\\out\\summary.csv";
        List<Product> product = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();

            while(line != null){ // Checa se o item não é nulo
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                product.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
                for(Product item : product){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine(); // Quebra de linha
                }
            } catch (IOException e){
                System.out.println("Error writing files: " + e.getMessage());
            }
        } catch (IOException e){
            System.out.println("Error reading files: " + e.getMessage());
        }

    }
}
