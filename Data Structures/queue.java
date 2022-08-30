// FIFO (First-In-First-Out)
// Elements are inserted at the end of the list
// Elements are deleted from the beginning of the list

import java.util.LinkedList;
import java.util.Queue;

public class importQueue
{
    public static void main (String [] args)
    {
        Queue<Integer> example = new LinkedList();
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

        System.out.println("\nElements of imported Queue after 5 deletions:");

        for (int pass : example)
        {
            System.out.print(pass + " ");
        }
    }
}

public class initializeQueue
{

    public class Queue
    {
        int front, rear, size, capacity;
        int arr[];

        public Queue (int size)
        {
            capacity = size;
            front = 0;
            size = 0;

            rear = capacity -1;
            arr = new int[queue.capacity];
        }
    }

    public static void main (String [] args)
    {
        Queue example = new Queue(5);

        for (int i = 0; i < example.capacity; i++)
        {
            System.out.println(example.arr[i]);
        }
    }
}