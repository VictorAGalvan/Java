package exercicios.exception;

import exercicios.exception.entities.Account;
import exercicios.exception.entities.WithdrawException;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        Integer number;
        String name;
        Double initialBalance;
        Double limit;
        Double amount;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        number = sc.nextInt();
        System.out.print("Holder: ");
        name = sc.nextLine();
        System.out.print("Initial balance: ");
        initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        limit = sc.nextDouble();
        Account conta = new Account(initialBalance,name,number,limit);
        System.out.print("\nEnter amount for withdraw: ");
        try {

            conta.withdraw(  sc.nextDouble());
            System.out.println("New balance: " + conta.getBalance());
        }catch (WithdrawException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
