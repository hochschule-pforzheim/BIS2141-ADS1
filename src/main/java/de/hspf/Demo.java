package de.hspf;

/**
 * The Demo class demonstrates the use of the Book class. It shows how to create
 * Book objects, assign values to their fields, and call methods on them.
 *
 * This example is intended for first-semester students learning about
 * object-oriented programming in Java.
 */
public class Demo
{

    public static void main(String[] args)
    {
        // Create a simple String variable
        String anyKindOfText = "Hello";

        // Create a new Book object using the default constructor
        Book myBook = new Book();

        // Assign an author name to the book
        myBook.author = "Sample Author";

        // Create another Book object using a constructor with a title
        Book secondBook = new Book("Sample Story");

        // Print out information about the second book
        System.out.println("Author: " + secondBook.author);  // Prints null if author not set
        System.out.println("Title: " + secondBook.title);    // Prints the title given to the constructor

        // Print out the author name of the first book
        System.out.println("First book author: " + myBook.author);

        // Change the author name of the first book
        myBook.author = "My New Author";

        // Print the updated author name
        System.out.println("Updated author: " + myBook.author);

        // Call the printDetails() method on both Book objects
        myBook.printDetails();
        secondBook.printDetails();
    }
}
