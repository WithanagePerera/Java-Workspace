// Set of verticies and edges that connects stored data
// Each vertex and edge have a relation

import java.util.*;


class Graph <T>
{
    private Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T vertex)
    {
        map.put(vertex, new LinkedList<T>);
    }

    public void addEdge(T source, T destination, boolean bidirectional)
    {
        // If graph doesn't already contain node, adds it
        if (!map.containsKey(source))
            addVertex(source);

        // If graph doesn't already contain node, adds it
        if (!map.containsKey(destination))
            addVertex(destination);
        
        // Adds node to list of accessible nodes/paths
        map.get(source).add(destination);
        
        // If node is 2-way, accesses the list associated with that node and adds the source as an accessible node
        if (bidirectional)
            map.get(destination).add(source);
    }

    public void getVertexCount()
    {}
}