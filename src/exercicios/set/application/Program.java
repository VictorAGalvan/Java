package exercicios.set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in );
        int n;
        Set<Long> alunos = new HashSet<>();
        System.out.println("How many students in A: ");
        n = sc.nextInt();
        for(int i =0; i < n ; i++){
            alunos.add(sc.nextLong());
        }
        System.out.println("How many students in B: ");
        n = sc.nextInt();
        for(int i =0; i < n ; i++){
            alunos.add(sc.nextLong());
        }
        System.out.println("How many students in C: ");
        n = sc.nextInt();
        for(int i =0; i < n ; i++){
            alunos.add(sc.nextLong());
        }
        System.out.println("Total: " + alunos.size());
    }
}
