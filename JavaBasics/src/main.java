import java.awt.desktop.SystemEventListener;

public class main
{
    public static void main (String[] args)
    {
        System.out.println("Hello Juan Pedro Casian");
        System.out.println("You are starting to learn a new programing language!");
        System.out.println("You are just starting to learn about classes so here is your work about it:");

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
    }
}
