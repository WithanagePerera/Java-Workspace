import java.util.HashSet;

public class hash_set
{
    public static void main (String [] args)
    {
        HashSet<Integer> values = new HashSet<>();

        for (int i = 0; i < 25; i++)
        {
            values.add(i);
        }

        System.out.println(values);

        for (int i = 24; i > -1; i--)
        {
            values.remove(i);
        }

        System.out.println(values);
    }
}