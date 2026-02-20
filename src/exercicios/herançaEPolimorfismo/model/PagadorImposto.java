package exercicios.herançaEPolimorfismo.model;

public abstract class PagadorImposto {
    String nome;
    double rendaAnual;

    public PagadorImposto(double rendaAnual, String nome) {
        this.rendaAnual = rendaAnual;
        this.nome = nome;
    }

    public abstract double getTax();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


}
