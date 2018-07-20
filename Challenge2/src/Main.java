import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner myscan = new Scanner(System.in);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        String userInput;

        System.out.println("This is a 2 dice app, type \"roll\" to roll the dice.");
        userInput = myscan.next();
        while (userInput.contains("roll"))
        {
            int res;
            dice1.roll();
            dice2.roll();

            res = dice1.value + dice2.value;
            System.out.println("Result: " + res);
            System.out.println("Do you want to roll again? Type \"roll\"");
            System.out.println("Type anything else to leave");
            userInput = myscan.next();
        }
    }
}
