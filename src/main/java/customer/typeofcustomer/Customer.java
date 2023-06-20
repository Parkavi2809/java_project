package customer.typeofcustomer;

public class Customer {

    public int customerId;
    public String name;
    public String address;
    public long[] phoneno;
    public int billId;
    public String modeOfPayment;
    public int processingCharge;
    public String typeOfCustomer;
    public int discount;

    public Customer()
    {
      billId = 5001;
      customerId = 1001;
      name = "John";
      phoneno = new long[]{9980724567l,9886755678l,8879596442l};
      address = "No.333, ABC Street,Mysore,Karnataka,570001";
    }
    public Customer(String modeOfPayment,int processingCharge,String typeOfCustomer)
    {
        this.modeOfPayment = modeOfPayment;
        this.processingCharge = processingCharge;
        this.typeOfCustomer = typeOfCustomer;
        checkType();
    }
    public void checkType()
    {
        if(typeOfCustomer=="Regular")
        {
         discount = 10;
        }
        else if(typeOfCustomer=="Privileged")
        {
            discount = 20;
        }
        else
        {
            discount =0;
        }
    }
    public int calculateBillAmount()
    {
        int amount =1500;
        return amount+processingCharge-discount;
    }


}
