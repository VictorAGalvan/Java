package exercicios.exception.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public void deposit(Double amount) {
        if (amount <= 0){
            throw new DepositException("Não é possivel depositar valores iguais ou menores que zero");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) throws WithdrawException {
        if (amount > withdrawLimit){
            throw new WithdrawException("Erro de saque: A quantia excede o limite de saque");

        }
        if (amount > balance) {
            throw new WithdrawException("Erro de saque: Saldo insuficiente");
        }

    }

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
