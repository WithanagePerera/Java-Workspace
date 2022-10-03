public class custom_linked_list
{
    public static void main (String [] args)
    {
        Node head = new Node(0, null);
        Node second = new Node(1, null);
        Node third = new Node(2, null);

        head.next = second;
        second.next = third;

        printList(head);
    }
}

public class Node
{
    private int data;
    Node next;

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public void printList(Node head)
    {
        Node node = head;
        while (node.next != null)
        {
            System.out.print(next.data + " ");
            node = node.next;
        }
    }
}