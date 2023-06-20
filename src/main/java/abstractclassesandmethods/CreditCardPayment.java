package abstractclassesandmethods;

public class CreditCardPayment extends RRPaymentServices {
    static int counter=1111;
    String paymentID;
    double cashBack;
    double balanceDue;

    public CreditCardPayment(double balance,int CustomerId)
    {
       super(balance,CustomerId);
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }
    public void payBill(double amount)
    {
      if(amount>getBalance())
      {
         paymentID = "C"+counter;
         balanceDue =0;
         cashBack = amount-getBalance();
          System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+"Payment details are ");
          System.out.println("Customer ID : "+customerId);
          System.out.println("Payment ID : "+paymentID);
          System.out.println("Previous Due : "+getBalance());
          System.out.println("Remaining Due : "+balanceDue);
          System.out.println("CashBack wallet Balance : "+cashBack);

      }
      else {
          paymentID = "C"+counter;
          cashBack =0;
          balanceDue = getBalance()- amount;
          System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+"Payment details are ");
          System.out.println("Customer ID : "+customerId);
          System.out.println("Payment ID : "+paymentID);
          System.out.println("Previous Due : "+getBalance());
          System.out.println("Remaining Due : "+balanceDue);
          System.out.println("CashBack wallet Balance : "+cashBack);

      }
      counter++;
    }
}
