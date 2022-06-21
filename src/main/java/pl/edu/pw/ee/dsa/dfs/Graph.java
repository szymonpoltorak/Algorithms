package pl.edu.pw.ee.dsa.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;

public class Graph {
    private final ArrayList<Integer>[] vertices;
    private final int numOfVertices;

    @SuppressWarnings("unchecked")
    public Graph(int numOfVertices){
        this.numOfVertices = numOfVertices;
        vertices = new ArrayList[numOfVertices];
    }

    public void addNewEdge(int source, int target){
        if (vertices[source] == null) {
            vertices[source] = new ArrayList<>();
        }
        if (vertices[target] == null) {
            vertices[target] = new ArrayList<>();
        }

        vertices[source].add(target);
    }

    public ListIterator<Integer> getVertexIterator(int index){
        if (vertices[index] == null){
            return null;
        }

        return vertices[index].listIterator();
    }

    public int getNumOfVertices() {
        return numOfVertices;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Graph graph = (Graph) object;

        return numOfVertices == graph.numOfVertices && Arrays.equals(vertices, graph.vertices);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numOfVertices);

        result = 371 * result + Arrays.hashCode(vertices);

        return result;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices = \n" + Arrays.toString(vertices) +
                "\n, numOfVertices=" + numOfVertices +
                "}\n";
    }
}
