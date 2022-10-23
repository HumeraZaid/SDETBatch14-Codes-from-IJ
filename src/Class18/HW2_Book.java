package Class18;

public class HW2_Book {

    /* Write Book class that will have instance variables and 2 Constructors.
       While creating an object make sure:
       Instance variables are being initialized
       Both Constructors are being executed
     */

    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    private int pages;
    private String isbnNumber;
    private int yearOfPublishing;
    private String publicationHouse;

    public HW2_Book(String bookName, String bookAuthor, String bookGenre, int pages)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.pages = pages;
        System.out.println(bookName + ", written by the famous author, " + bookAuthor + ", is a " + pages +
                " pages " + bookGenre + " book." );
    }

    public HW2_Book(String isbnNumber, int yearOfPublishing, String publicationHouse)
    {
        this.isbnNumber = isbnNumber;
        this.yearOfPublishing = yearOfPublishing;
        this.publicationHouse = publicationHouse;
        System.out.println("The 13-digit ISBN number of the paperpack of this book is " + isbnNumber +
                ", and it was published in " + yearOfPublishing + " by the " + publicationHouse
                + " publications.");
    }

    public static void main(String[] args) {
       new HW2_Book("The Alchemist", "Paulo Coelho", "fictional", 192 );
       new HW2_Book("978-0007155668", 1988,"HarperCollins");

    }

}
