package exercicios.interfaces.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    List<Installment> installments = new ArrayList<>();

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallments(Installment installment) {
        this.installments.add(installment);

    }
    public void removeInstallments(Installment installment) {
        this.installments.remove(installment);
    }

    public Contract(LocalDate date, Integer number, Double totalValue) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
