package exercicios.herançaEPolimorfismo;

import exercicios.herançaEPolimorfismo.model.ImportedProducts;
import exercicios.herançaEPolimorfismo.model.Product;
import exercicios.herançaEPolimorfismo.model.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int N;
        char type;
        String name;
        double price;
        double customFee;
        LocalDate manufactureDate;
        List<Product> products =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        N = sc.nextInt();
        for(int i =1; i<=N; i++) {
            System.out.println("Product #" + i +  " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                customFee = sc.nextDouble();
                Product p = new ImportedProducts(name, price ,customFee);
                products.add(p);
            } else if (type == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                manufactureDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product p = new UsedProduct(name, price ,manufactureDate);
                products.add(p);
            }else {
                Product p = new Product(name, price);
                products.add(p);
            }

        }
        System.out.println("PRICE TAGS: ");
        for(Product p  : products ) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }

}

