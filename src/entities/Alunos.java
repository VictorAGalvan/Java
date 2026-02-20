package entities;

public class Alunos {
    public double[] notas = new double[3];
    public String nome ;
    public double notaFinal(){
        double soma= 0;
        for(int i = 0; i<notas.length;i++){
            soma +=notas[i];

        }
        return (double) soma;
    }
    public String toString(){
        double notaFinal = notaFinal();
        if (notaFinal  < 60){
            return "FINAL GRADE = " + notaFinal + "\nFAILED\nMISSING " + (notaFinal - 60) + " POINTS" ;
        }else {
            return "FINAL GRADE = " + notaFinal + "\nPASS";
        }
    }
}
