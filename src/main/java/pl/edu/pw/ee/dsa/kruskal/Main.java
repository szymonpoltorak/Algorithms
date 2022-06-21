package pl.edu.pw.ee.dsa.kruskal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Edge[] edges = new Edge[] {
                new Edge(1, 0, 1),
                new Edge(2, 0, 2),
                new Edge(3, 1, 2),
                new Edge(1, 1, 3),
                new Edge(3, 1, 4),
                new Edge(1, 2, 4),
                new Edge(2, 2, 3),
                new Edge(2, 3, 4),
                new Edge(4, 3, 5),
                new Edge(3, 4, 5),
        };
        int numOfNodes = 6;
        int size =  numOfNodes - 1;
        Subset[] subsets = new Subset[numOfNodes];

        Arrays.sort(edges);

        for (int i = 0; i < subsets.length; i++){
            subsets[i] = new Subset();
            subsets[i].setParent(i);
        }

        Kruskal.kruskalAlgorithm(edges, subsets);
        System.out.println("Result:\n" + Kruskal.resultToText(edges, size));
    }
}
