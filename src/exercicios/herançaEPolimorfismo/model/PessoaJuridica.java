package exercicios.herançaEPolimorfismo.model;

public class PessoaJuridica extends PagadorImposto{
    private int numFuncionarios;

    public PessoaJuridica(double rendaAnual, String nome, int numFuncionarios) {
        super(rendaAnual, nome);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double getTax() {
        double imposto = 0.16;
        if (numFuncionarios > 10)
            imposto = 0.14;

        return getRendaAnual() * imposto;
    }

    @Override
    public String toString() {
        return nome + " : $ "+ getTax();
    }
}
