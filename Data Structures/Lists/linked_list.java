// Elements are not stored in contiguous locations
// Elements are linked using pointers
// Each element is called a node
// Nodes cannot be accessed directly instead
// Must start from head and follow through link to reach desired node

import java.util.LinkedList;

public class linked_list
{
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

        System.out.println("Element at index 5: " + example.get(5));
        System.out.println("Element at index 10: " + example.get(10));
    }
}