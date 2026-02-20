package exercicios.arquivos.application;

import exercicios.arquivos.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static void main() {
        String path = "C:\\Users\\Victor Galvan\\IdeaProjects\\untitled\\src\\exercicios\\arquivos\\in\\in.csv";
        List<Product> produtos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] varList= line.split(",");
                produtos.add(new Product(varList[0],Integer.parseInt(varList[2]),Double.parseDouble(varList[1])));
                line = br.readLine();

            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Victor Galvan\\IdeaProjects\\untitled\\src\\exercicios\\arquivos\\out\\summary.csv"))) {
            for (Product p : produtos){
                bw.write(String.format("%s,%.2f", p.getName(),p.totalPrice()));
                bw.newLine();
            }
       }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
