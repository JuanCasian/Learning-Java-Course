public class Main {
    public static void main(String args[])
    {
        ChildAccount childAccount = new ChildAccount(43248, 200,
                "George Lopez", "Leopoldo Dias");
        BankAccount adultAccount = new BankAccount(84935, 1000, "Juan Perez");

        adultAccount.printAccountInfo();
        System.out.println();
        childAccount.printAccountInfo();
    }

}
