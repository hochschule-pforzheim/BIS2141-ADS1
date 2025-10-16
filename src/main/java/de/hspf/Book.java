package de.hspf;

/**
 * The Book class represents a simple model of a book. It contains basic
 * information such as the title, author, and price.
 */
public class Book
{

    // Public fields (attributes) that store information about the book
    public String title;   // The title of the book
    public String author;  // The author who wrote the book
    public double price;   // The price of the book

    /**
     * Constructor with one parameter (title). This allows you to create a book
     * when you only know the title.
     */
    public Book(String title)
    {
        // 'this.title' refers to the current object's title field.
        // The parameter value is assigned to that field.
        this.title = title;
    }

    /**
     * Default constructor (no parameters). This creates a book object without
     * setting any initial values.
     */
    public Book()
    {
        // This constructor does not set any fields.
        // Fields will have their default values:
        // title and author = null, price = 0.0
    }

    /**
     * Constructor with three parameters. This allows you to create a book with
     * title, author, and price.
     */
    public Book(String title, String author, double price)
    {
        // 'this' is used to distinguish between the instance variables
        // and the parameters that have the same names.
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * This method prints out all the details of the book to the console (title,
     * author, and price).
     */
    public void printDetails()
    {
        // Print each field on a separate line
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }
}
