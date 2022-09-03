// Stores items in key/value pairs
// Keys and values can be different data types

import java.util.HashMap;

public class hash_map
{
    public static void main (String [] args)
    {
        // Initializing hashmap
        HashMap<Integer, String> speed = new HashMap<>();

        // Entering pairs
        speed.put(1, "C");
        speed.put(2, "C++");
        speed.put(3, "Rust");
        speed.put(4, "C#");
        speed.put(5, "Fortran");
        speed.put(6, "Julia");
        speed.put(7, "Chapel");
        speed.put(8, "Ada");
        speed.put(9, "Haskell");
        speed.put(10, "OCaml");

        // Size of hashmap
        System.out.println(speed.size() + " Fastest Languages:\n");
        for (int i = 1; i < 11; i++)
        {
            // Retrieving pairs
            System.out.println(speed.get(i));
        }

        System.out.println();

        // Size of hashmap
        System.out.println("Deleting " + speed.size() + " slowest.\n");
        for (int i = 10; i > 5; i--)
        {
            // Removing pairs
            speed.remove(i);
        }

        System.out.println();

        // Size of hashmaps
        System.out.println(speed.size() + " Fastest Languages:\n");
        
        // Iteration with for-each loop
        for (int pass : speed.keySet())
        {
            System.out.println(speed.get(pass));        
        }

        // Clearing hashmap
        speed.clear();
    }
}