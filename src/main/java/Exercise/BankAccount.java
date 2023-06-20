package Exercise;

public class BankAccount {
    private int accNo;
    private String accName;
    private double balance;

    public BankAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public void deposit(int amount)
    {
        balance += amount;
    }
    public void withdraw(int amount)
    {
        if(balance<amount)
        {
            System.out.println("You don't have sufficient money in your account");
        }
        else {
            balance -= amount;
        }
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }
}
