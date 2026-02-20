package exercicios.interfaces.services;

import exercicios.interfaces.entities.Contract;
import exercicios.interfaces.entities.Installment;

public class ContractService {
    OnlinePaymentService pay;

    public ContractService(OnlinePaymentService pay) {
        this.pay = pay;
    }

    public void processContract(Contract contract, Integer months){

        Double amount;
        for (int i = 1; i <= months ; i++){
            amount = contract.getTotalValue()/ months;
            amount  +=  pay.paymentFee(amount);
            amount += pay.interest(amount, i);
            contract.addInstallments(new Installment(amount,contract.getDate().plusMonths(i)));
        }
    }
}
