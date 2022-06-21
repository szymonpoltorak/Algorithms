package pl.edu.pw.ee.dsa.dfs;

public class Main {
    public static void main(String[] args) {
        var graph = new Graph(4);

        graph.addNewEdge(0, 1);
        graph.addNewEdge(0, 2);
        graph.addNewEdge(1, 3);
        graph.addNewEdge(1, 0);
        graph.addNewEdge(2, 0);
        graph.addNewEdge(2, 3);
        graph.addNewEdge(3, 1);
        graph.addNewEdge(3, 2);

        System.out.println("Starting DFS");
        if (Dfs.dfsFinder(graph)){
            System.out.println("Graph is coherent!");
        }
        else {
            System.out.println("Graph is not coherent!");
        }
    }
}
