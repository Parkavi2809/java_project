package abstractclassesandmethods;

public class Testerclass {
    public static void main(String[] args) {
        RRPaymentServices RRP = null;
        RRP=new CreditCardPayment(10000.23d,5001);
        RRP.payBill(15000.0d);

        RRP = new ShoppingPayment(10000.23d,5001);
        RRP.payBill(0d);
    }
}
