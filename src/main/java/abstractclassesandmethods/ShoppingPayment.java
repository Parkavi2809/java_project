package abstractclassesandmethods;

public class ShoppingPayment extends RRPaymentServices{

    static int counter= 1001;
    String paymentID;

    public ShoppingPayment(double balance,int customerId) {
        super(balance, customerId);
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void payBill(double amount)
    {
        if(amount==getBalance())
        {
            paymentID = "S"+counter;
            System.out.println("Your payment of Rs. "+getBalance()+"is successful with paymentId "+paymentID);
        } else if (amount>getBalance())
        {
            System.out.println("Excess amount entered!! please try again");
        }
        else
        {
            System.out.println("Insufficient amount entered!! please try again");
        }
        counter++;
    }
}
