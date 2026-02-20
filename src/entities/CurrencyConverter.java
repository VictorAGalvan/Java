package entities;

public class CurrencyConverter {
    public double IOF = 0.06;
    public static double converter(double dollar, double quantity){
        return dollar*quantity +dollar*quantity*0.06;
    }
}
