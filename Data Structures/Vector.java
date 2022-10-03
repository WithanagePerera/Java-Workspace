// Growable array of objects
// Implements dynamic array (grow and shrink as required)
// Like an array, it contains components that can be accessed using an integer index
// Similar to ArrayList, but Vector is synchronized (multithreading) making it slower
// It also has some legacy methods
// Doubles in size if total number of elements exceeds capacity

public class Vector <E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
    public static void main (String [] args)
    {
        Vector<Integer> vector = new Vector<>(25);
    }
}