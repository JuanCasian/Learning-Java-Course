import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        int     age;
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will tell you which sport to play depending on your age");
        System.out.println("Please input your age: ");
        age = sc.nextInt();
        if (age >= 0 && age <= 10)
            System.out.println("Soccer");
        else if (age >= 11 && age <= 25)
            System.out.println("Football");
        else if (age >= 26 && age <= 110)
            System.out.println("Golf");
        else if (age > 110)
            System.out.println("Are you really over 110? Are you god or what?");
        else
            System.out.println("You can't be younger than 0 dude!");
    }
}
