import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class MeuPrimeiroPrograma {
    public static void main (String[] args) {
        int n;
        boolean validation = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();
        ArrayList<Employee> empregados = new ArrayList<Employee>();
        for (int i = 0; i <n; i++){
            Employee temp = new Employee();
            System.out.print("Digite o id: ");
            if(!temp.setId(sc.nextInt(),empregados)){
                validation = false;
                break;
            }
            sc.nextLine();
            System.out.print("Digite o nome: ");
            temp.setName(sc.nextLine());
            System.out.print("Digite o salário: ");
            temp.setGrossSalary(sc.nextDouble());
            empregados.add(temp);
        }
        if (validation){
            int tempId;
            boolean validacao= false;
            System.out.println("Digite o ID: ");
            tempId =sc.nextInt();
            for (Employee idValidation: empregados ){
                if (tempId == idValidation.getId()){
                    validacao = true;
                }
            }
            if (validacao) {
                System.out.println("Digite o aumento: ");

                for (Employee empregado:  empregados){
                    if (tempId == empregado.getId()){
                       empregado.icreaseSalary(sc.nextDouble());
                    }
                }
                for (Employee empregado:  empregados){
                    System.out.println(empregado);
                }
            }

        }
    }
}
