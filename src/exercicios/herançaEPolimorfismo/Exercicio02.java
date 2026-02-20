package exercicios.herançaEPolimorfismo;

import exercicios.herançaEPolimorfismo.model.PagadorImposto;
import exercicios.herançaEPolimorfismo.model.PessoaFisica;
import exercicios.herançaEPolimorfismo.model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char type;
        String name;
        double anualIncome;
        double healthExpenditures;
        int numOfEmp;
        double soma = 0 ;

        List<PagadorImposto> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        for (int i =1; i<=N; i++){
            System.out.println("Tax payer #" + i +" data:");
            System.out.print("Individual or company (i/c)? ");
            type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Anual Income: ");
            anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(anualIncome, name, healthExpenditures));

            }else {
                System.out.println("Number of employees: ");
                numOfEmp = sc.nextInt();
                list.add(new PessoaJuridica(anualIncome, name, numOfEmp));
            }
        }
        for(int i =0; i< list.size(); i++){
            PagadorImposto p = list.get(i);

            System.out.println(p);
            soma += p.getTax();
        }
        System.out.println("TOTAL TAXES : " + soma );
        sc.close();
    }
}
