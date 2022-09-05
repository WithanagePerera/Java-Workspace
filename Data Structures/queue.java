// FIFO (First-In-First-Out)
// Elements are inserted at the end of the list
// Elements are deleted from the beginning of the list

import java.util.LinkedList;
import java.util.Queue;

public class queue
{
    public static void main (String [] args)
    {
        Queue<Integer> example = new LinkedList<>();
        for (int i = 0; i < 25; i++)
        {
            example.add(i);
        }

        System.out.println("Elements of imported Queue:");

        for (int pass : example)
        {
            System.out.print(pass + " ");
        }

        for (int i = 0; i < 5; i++)
        {
            example.remove();
        }

        System.out.println("\n\nElements of imported Queue after 5 deletions:");

        for (int pass : example)
        {
            System.out.print(pass + " ");
        }
    }
}