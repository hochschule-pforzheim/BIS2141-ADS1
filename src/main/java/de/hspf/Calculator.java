package de.hspf;

// This class defines a simple calculator with methods to multiply two numbers.
public class Calculator
{
    // This method multiplies two integer numbers.
    // It takes two int parameters (numberOne and numberTwo),
    // calculates their product, prints the result, and returns it.
    public static int multiply(int numberOne, int numberTwo)
    {
        int result = numberOne * numberTwo;   // Multiply the two numbers and store the result
        System.out.println(result);           // Print the result to the console
        return result;                        // Return the result to whoever called the method
        // Note: The line below would do the same thing in one step, without using 'result'
        // return numberOne * numberTwo;
    }

    // This method multiplies two decimal (double) numbers.
    // It uses the same name 'multiply', but since the parameter types are different,
    // this is an example of *method overloading* in Java.
    public static double multiply(double numberOne, double numberTwo)
    {
        // This is the short version: it directly returns the product of the two numbers.
        return numberOne * numberTwo;
    }
}