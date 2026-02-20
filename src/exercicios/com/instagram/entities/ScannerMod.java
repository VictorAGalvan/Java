package exercicios.com.instagram.entities;
import java.util.Objects;
import java.util.Scanner;

public class ScannerMod {
    private final Scanner sc;

    public ScannerMod(){
        sc = new Scanner(System.in);
    }

    public String nextLine(){
        String input = sc.nextLine();
        if (Objects.equals(input, "S")){
            System.out.println("Finalizando o programa...");
            System.exit(0);
            return null;
        }else{
            return input;
        }

    }
    public void close(){
        sc.close();
    }
}
