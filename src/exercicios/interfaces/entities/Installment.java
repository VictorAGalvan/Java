package exercicios.interfaces.entities;

import java.time.Instant;
import java.time.LocalDate;

public class Installment {
    private LocalDate dueData;
    private Double amount;

    public Installment(Double amount, LocalDate dueData) {
        this.amount = amount;
        this.dueData = dueData;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDueData() {
        return dueData;
    }

    public void setDueData(LocalDate dueData) {
        this.dueData = dueData;
    }
}
