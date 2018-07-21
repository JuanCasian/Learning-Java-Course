public class ChildAccount extends BankAccount {
    String  KidsName;

    public ChildAccount(int idnum, double startingBalance, String iAccountHolder, String iKidsName) {
        super(idnum, startingBalance, iAccountHolder);
        this.KidsName = iKidsName;
    }

    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Kids name: " + this.KidsName);
    }
}
