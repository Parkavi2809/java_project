package Exercise;

public class BankTester {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345,"Karthick",5000);
        ba.deposit(1000);
        System.out.println("Updated balance: "+ba.getBalance());
        ba.withdraw(6700);
        System.out.println("Updated balance: "+ba.getBalance());
    }
}
