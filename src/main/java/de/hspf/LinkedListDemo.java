package de.hspf;

import java.util.LinkedList;

/**
 * Demonstration class for Linked Lists (Lecture 06).
 */
public class LinkedListDemo
{

    public static void main(String[] args)
    {
        // 1. Create a new LinkedList for Integer values
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Add five elements to the LinkedList (at the end)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial list: " + list);

        // 3. Remove the element at index 2 (0-based → removes the third element)
        Integer removed = list.remove(2);
        System.out.println("Removed element at index 2: " + removed);

        // 4. Print list after removal
        System.out.println("List after removal: " + list);

        // 5. Traversal using a normal for-loop (index-based)
        System.out.print("Traversal (for-loop): ");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 6. Traversal using the enhanced for-loop
        System.out.print("Traversal (for-each): ");
        for (Integer element : list)
        {
            System.out.print(element + " ");
        }
        System.out.println();

        // 7. Insert new elements at the beginning and at the end
        list.addFirst(5);  // Insert at head
        list.addLast(60);  // Insert at tail

        System.out.println("List after addFirst(5) and addLast(60): " + list);

        // 8. Remove elements from beginning and end
        Integer first = list.removeFirst();
        Integer last = list.removeLast();
        System.out.println("Removed with removeFirst(): " + first);
        System.out.println("Removed with removeLast(): " + last);
        System.out.println("Final list: " + list);
    }
}
