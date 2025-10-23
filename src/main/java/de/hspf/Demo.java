package de.hspf;

/**
 * The Demo class demonstrates how to use both the Book and Calculator classes.
 * It shows how to create and modify Book objects, and how Java handles method
 * overloading in the Calculator class when multiplying integers, doubles, and mixed types.
 */
public class Demo
{

    public static void main(String[] args)
    {
        // Call the three separate demonstration methods
        demonstrateBookUsage();
        demonstrateCalculatorUsage();
        demonstrateSemesterCredits();
    }

    /**
     * This method demonstrates how to create and use Book objects.
     */
    public static void demonstrateBookUsage()
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

    /**
     * This method demonstrates the use of the Calculator class and method overloading.
     */
    public static void demonstrateCalculatorUsage()
    {
        System.out.println("\n--- Calculator Demonstration ---");

        // Multiply two integers
        int intResult = Calculator.multiply(3, 5);
        System.out.println("int * int = " + intResult);

        // Multiply two doubles
        double doubleResult = Calculator.multiply(2.5, 4.2);
        System.out.println("double * double = " + doubleResult);

        // Mix int and double: one of the int values will be automatically converted to double
        double mixedResult = Calculator.multiply(4, 2.5);
        System.out.println("int * double = " + mixedResult);

        // The reverse order works too
        double mixedResult2 = Calculator.multiply(2.5, 4);
        System.out.println("double * int = " + mixedResult2);
    }

    /**
     * This method demonstrates how a simple workload or credit calculation
     * can be handled using a helper method called semester().
     */
    public static void demonstrateSemesterCredits()
    {
        int credits = 90;  // initial number of credits

        // Call the semester() method to process the workload
        int actualCredits = semester(credits);

        // Print both the original and processed values
        System.out.println("My credits are: " + credits);
        System.out.println("Actual credits: " + actualCredits);
    }

    /**
     * A simple helper method that represents a semester workload calculation.
     * Currently, it divides the workload by itself (so the result is always 1),
     * but this could later be extended to perform more complex logic.
     */
    public static int semester(int workload)
    {
        workload = workload / workload; // Simplified placeholder calculation
        System.out.println("The workload this semester is " + workload);
        return workload; // Return the calculated value
    }
}