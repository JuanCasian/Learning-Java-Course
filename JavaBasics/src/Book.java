public class Book
{
    int     nPages;
    String  title;
    String  author;
    int     nChapters;

    public Book(int inputnPages, String inputTitle, String inputAuthor, int inputnChapters)
    {
        this.nPages = inputnPages;
        this.title = inputTitle;
        this.author = inputAuthor;
        this.nChapters = inputnChapters;
    }

    public void changeAuthor(String newAuthor)
    {
        this.title = newAuthor;
    }

}
