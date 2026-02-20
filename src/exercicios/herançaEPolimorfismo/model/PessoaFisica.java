package exercicios.herançaEPolimorfismo.model;


public class PessoaFisica extends PagadorImposto {
    private double gastoSaude;


    public PessoaFisica(double rendaAnual, String nome, double gastoSaude) {
        super(rendaAnual, nome);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double getTax() {
        double imposto;
        double desconto = 0;
        if (getRendaAnual() < 20000){
            imposto = 0.15;
        }else {
            imposto = 0.25;
        }
        if (gastoSaude > 0){
            desconto = gastoSaude*0.5;
        }
        return getRendaAnual() * imposto - desconto;
    }

    @Override
    public String toString() {
        return nome + " : $ "+ String.format("%,2f",getTax());
    }
}
