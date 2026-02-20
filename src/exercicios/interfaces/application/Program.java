package exercicios.interfaces.application;

import exercicios.interfaces.entities.Contract;
import exercicios.interfaces.entities.Installment;
import exercicios.interfaces.services.ContractService;
import exercicios.interfaces.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Integer num;
        String date;
        Double value;
        Integer quantity;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        date = sc.nextLine();
        System.out.print("Valor do contrato: ");
        value = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        quantity = sc.nextInt();

        Contract obj = new Contract(LocalDate.parse(date,fmt),num,value);
        new ContractService(new PayPalService()).processContract(obj,quantity);

        System.out.println("Parcelas: ");
        for (Installment i : obj.getInstallments()){
            System.out.print(i.getDueData() + " - ");
            System.out.println(i.getAmount());
        }

    }
}
