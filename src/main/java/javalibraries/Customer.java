package javalibraries;

public class Customer {
    private int custId;
    private  String custName;

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public int hashCode()
    {
        return  custId;
    }
    public boolean equals(Object ob) {
        Customer cust = (Customer) ob;
        if (this.hashCode() == cust.hashCode()) {
            return this.custName.equals(cust.custName);
        }
        return false;
    }

    public static void main(String[] args) {
        Customer cs1 = new Customer(12,"Ajay");
        Customer cs2 = new Customer(13,"Ajay");
        if(cs1.equals(cs2))
        {
            System.out.println("Objects are equal");
        }
        else
        {
            System.out.println("Objects are not equal");
        }
    }
}
