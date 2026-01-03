package de.examprep;

/**
 *
 * Exam Preparation
 */
public class Logic
{

    public static void main(String[] args)
    {
        int number;

        number = 10;

        // second assignment
        number = 20;

        // declaration
        char[] words;

        // initialization (and first assignment)
        char[] greeting =
        {
            'H', 'i'
        };

        System.out.println("Greeting's length is: " + greeting.length);

        String[] collection = new String[10];
        collection[0] = "Hello";
        
        System.out.println("==========");
        sumToN(100);
    }

    public static int sumToN(int n)
    {
        if (n == 0)
        {
            return 0;
        } 
        else
        {
            return n * sumToN(n - 1);
        }
    }
}
