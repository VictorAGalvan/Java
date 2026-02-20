package exercicios.herançaEPolimorfismo.model;

public final class ImportedProducts extends Product{
    private double customFee;

    public ImportedProducts(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }


    public double totalPrice ( ){
        return getPrice() + getCustomFee();
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + totalPrice() + " Custom fee : $ " + getCustomFee();
    }
    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }
}
