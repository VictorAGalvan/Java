package exercicios.herançaEPolimorfismo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {
    private LocalDate manufactureDate ;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName()+ " (used) $ " + getPrice() + " Manufacture Date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
