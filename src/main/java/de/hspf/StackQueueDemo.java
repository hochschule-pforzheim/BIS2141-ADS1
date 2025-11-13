package de.hspf;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * Demonstration class for Stack (LIFO) and Queue (FIFO) concepts (Lecture 07).
 */
public class StackQueueDemo
{

    public static void main(String[] args)
    {
        demoStack();
        System.out.println("---------------------------");
        demoQueue();
    }

    /**
     * Demonstrates basic Stack operations: push, peek, pop, size, and empty.
     */
    private static void demoStack()
    {
        System.out.println("=== STACK (LIFO) DEMO ===");

        Stack<String> stack = new Stack<>();

        // push: add elements on top of the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack after three push operations: " + stack);

        // peek: look at the top element without removing it
        String top = stack.peek();
        System.out.println("peek() -> top element: " + top);
        System.out.println("Stack after peek (unchanged): " + stack);

        // pop: remove and return the top element
        String popped = stack.pop();
        System.out.println("pop() -> removed element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // size and empty
        System.out.println("Current size of stack: " + stack.size());
        System.out.println("Is stack empty? " + stack.empty());
    }

    /**
     * Demonstrates basic Queue operations: add (enqueue), remove/poll
     * (dequeue), peek, and isEmpty.
     */
    private static void demoQueue()
    {
        System.out.println("=== QUEUE (FIFO) DEMO ===");

        // LinkedList is one implementation of the Queue interface
        Queue<String> queue = new LinkedList<>();

        // add: enqueue -> add elements at the end of the queue
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        System.out.println("Queue after three add operations: " + queue);

        // peek: look at the front element without removing it
        String front = queue.peek();
        System.out.println("peek() -> front element: " + front);
        System.out.println("Queue after peek (unchanged): " + queue);

        // remove: dequeue -> remove the first element
        String dequeued = queue.remove();
        System.out.println("remove() -> removed element: " + dequeued);
        System.out.println("Queue after remove: " + queue);

        // isEmpty: check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
