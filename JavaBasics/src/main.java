import java.util.Arrays;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {

        // First functions in java, just printing some stuff
        /*
        System.out.println("Hello Juan Pedro Casian");
        System.out.println("You are starting to learn a new programing language!");
        System.out.println("You are just starting to learn about classes so here is your work about it:");
        */

        // First time working with object, and creating my own objects functions
        /*
        System.out.println();
        Book book1 = new Book(124, "Harry Potter", "ME", 16);
        System.out.println("This is the first object you created, based on class Books:");
        System.out.println("Book Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Number of pages: " + book1.nPages);
        System.out.println("Number of chapters: " + book1.nChapters);
        System.out.println();
        System.out.println("Me is not the author so I'll change it with a method from the class");
        System.out.println();
        book1.changeAuthor("J. K. Rowling");
        System.out.println("Once again here comes the book:");
        System.out.println("Book Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Number of pages: " + book1.nPages);
        System.out.println("Number of chapters: " + book1.nChapters);
        System.out.println();
        */

        // Strings practice: Creating strings and applying different functions ot it
        /*
        String myString = "It is our choices, Harry, that show what we truly are, far more than our abilities";
        System.out.println(myString.toUpperCase());
        String myStringLowercased = myString.toLowerCase();
        System.out.println(myStringLowercased);
        System.out.println();
        System.out.println("Now we will look if there is harry inside my string.");
        System.out.println("Contains harry: " + myString.contains("harry"));
        System.out.println("In fact my string does not contains harry it contains Harry \n" +
                " In order for us to find any kind of harry we need to make the string all lowercase or uppercase" +
                "and look for it that way");
        System.out.println("Contains harry: " + myString.toLowerCase().contains("harry"));
        */

        // Getting user inputs and working with them
        /*
        String  password = "car";
        int     intPass = 37;
        double  doublePass = 2.5;
        String  userAnswerString;
        int     userAnswerInt;
        double  userAnswerDouble;

        Scanner myscan = new Scanner(System.in);

        System.out.println("Hello welcome to the club, but in order to get in you need to solve 3 challenges");
        System.out.println();
        System.out.println("First challenge: What is a synonym of automobile?");
        userAnswerString = myscan.next();
        if (password.toLowerCase().contains(userAnswerString.toLowerCase()))
        {
            System.out.println("Next Challenge: how much is 37 * 1");
            userAnswerInt = myscan.nextInt();
            if (userAnswerInt == intPass)
            {
                System.out.println("Last challenge: how much is 5 / 2");
                userAnswerDouble = myscan.nextDouble();
                if (doublePass == userAnswerDouble)
                {
                    System.out.println("Welcome to the club!");
                }
                else
                    System.out.println("Sorry I can not let you in");
            }
            else
                System.out.println("Sorry I can not let you in");
        }
        else
            System.out.println("Sorry I can not let you in");
        */

        // Arrays

        int[]   myArray = new int[5];
        int     i;
        Scanner myscan = new Scanner(System.in);

        i = 0;
        while (i < myArray.length)
        {
            System.out.println("Please enter a number: ");
            myArray[i] = myscan.nextInt();
            i++;
        }
        System.out.println("The numbers you entered in ascending order are:");
        Arrays.sort(myArray);
        i = 0;
        while (i < myArray.length)
        {
            System.out.println(myArray[i]);
            i++;
        }

    }
}
