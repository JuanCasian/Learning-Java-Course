public class BankAccount {
    private double  balance;
    private int     id;
    private String  AccountHolder;

    public BankAccount (int idnum, double startingBalance, String iAccountHolder)
    {
        this.balance = startingBalance;
        this.id = idnum;
        this.AccountHolder = iAccountHolder;
    }

    public void printAccountInfo()
    {
        System.out.println("Account holder: " + this.AccountHolder);
        System.out.println("Account id: " + this.id);
        System.out.println("Balance: $" + this.balance);
    }
}
