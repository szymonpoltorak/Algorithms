package pl.edu.pw.ee.dsa.dfs;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ListIterator;

public class Dfs {
    private Dfs(){}

    public static boolean dfsFinder(@NotNull Graph graph){
        for (int i = 0; i < graph.getNumOfVertices(); i++){
            var visited = new boolean[graph.getNumOfVertices()];
            Dfs.findVisited(i, visited, graph);

            if (!checkCoherence(visited)){
                return false;
            }
        }
        return true;
    }

    public static void findVisited(int startingVertex, boolean @NotNull [] visited, @NotNull Graph graph){
        if (graph.getVertexIterator(startingVertex) == null){
            return;
        }
        visited[startingVertex] = true;
        ListIterator<Integer> iterate = graph.getVertexIterator(startingVertex);

        while(iterate.hasNext()){
            int nextVertex = iterate.next();

            if (!visited[nextVertex]){
                Dfs.findVisited(nextVertex, visited, graph);
            }
        }
    }

    @Contract(pure = true)
    public static boolean checkCoherence(boolean @NotNull [] visited){
        for (boolean vertex : visited){
            if (!vertex){
                return false;
            }
        }
        return true;
    }
}
