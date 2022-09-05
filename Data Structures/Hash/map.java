// Map is an interface used for creating implementations
// 3 general purpose implementations are HashMap, TreeMap, and LinkedHashMap 
import java.util.Map;
import java.util.HashMap;

public class map
{
    public static void main (String [] args)
    {
        Map<Integer, String> speed = new HashMap<>();

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

        for (Map.Entry<Integer, String> pass : speed.entrySet())
            System.out.println(pass.getKey() + "\t" + pass.getValue());
    }
}