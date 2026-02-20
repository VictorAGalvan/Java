package exercicios.interfaces.services;

public class PayPalService  implements OnlinePaymentService {
    Double JUROS = 0.01;
    Double TAX = 0.02;

    @Override
    public Double paymentFee(Double amount) {

        return amount *TAX;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount*(JUROS*months);
    }
}
