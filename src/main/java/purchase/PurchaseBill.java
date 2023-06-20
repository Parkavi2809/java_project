package purchase;

import customer.typeofcustomer.Customer;

public class PurchaseBill {
    public static void main(String[] args) {

        Customer cs = new Customer();
        System.out.println("Bill Id: "+ cs.billId);
        System.out.println("Customer Id: "+cs.customerId);
        System.out.println("Customer Name: "+cs.name);
        System.out.println("Customer Numbers :");
        for(long i:cs.phoneno)
        {
            System.out.println(i+" ");
        }
        System.out.println("Customer Address: "+cs.address);
        cs = new Customer("Cash",150,"Regular");
        System.out.println("Discount: "+cs.discount);
        System.out.println("Final Amount to be paid: Rs."+cs.calculateBillAmount());

    }

}
