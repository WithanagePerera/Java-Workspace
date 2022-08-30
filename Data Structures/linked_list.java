// Elements are not stored in contiguous locations
// Elements are linked using pointers
// Each element is called a node
// Nodes cannot be accessed directly instead
// Must start from head and follow through link to reach desired node

public class basic_linked_list
{

    import java.util.LinkedList;

    public void reverse(LinkedList<Integer> pass)
    {

    }

    public static void main (String [] args)
    {
        LinkedList<Integer> example = new LinkedList<>();

        for (int i = 0; i < 30; i++)
        {
            example.add(i);
        }

        for (Integer pass : example)
            System.out.print(pass + " ");

        System.out.println("Element at index 5: " example.get(5));
        System.out.println("Element at index 10: " example.get(10));
    }
}

// Only works for one data type
public class LinkedList
{
    static Node head;

    static class Node
    {
        // Defines Node attributes
        int value;
        Node next;

        // Node constructor
        Node (int d)
        {
            value = d;
            next = null;
        }
    }

    Node get(int index)
    {
        if (index == 0)
        {
            return this.head;
        }
        else if (index == 1)
        {
            return this.head.next;
        }
        else
        {
            Node placeholder = this.head.next;
            for (int i = 1; i < index; i++)
            {
                placeholder = placeholder.next;
            }

            return placeholder;
        }
    }

    void add(int data)
    {
        for (int i = 0; i < )
    }

    public static void main (String [] args)
    {
        // No defined constructor so we use default constructor
        LinkedList example = new LinkedList();

        example.head = new Node(2);

        for (int i = 0; i < 30; i++)
        {
            example.
        }
    }
}