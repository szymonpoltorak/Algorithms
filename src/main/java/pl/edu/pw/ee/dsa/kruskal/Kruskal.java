package pl.edu.pw.ee.dsa.kruskal;

import org.jetbrains.annotations.NotNull;

public class Kruskal {
    private Kruskal(){}

    public static void kruskalAlgorithm(Edge @NotNull [] result, Subset[] subsets){
        int j = 0;

        for (int i = 0; i < result.length - 1; i++){
            Edge followingEdge = result[i];

            int source = Kruskal.find(subsets, followingEdge.getStartNode());
            int destination = Kruskal.find(subsets, followingEdge.getEndNode());

            if (source != destination){
                result[j++] = followingEdge;
                Kruskal.unify(subsets, source, destination);
            }
        }
    }

    private static void unify(Subset[] subsets, int source, int destination){
        int startRootNode = Kruskal.find(subsets, source);
        int endRootNode = Kruskal.find(subsets, destination);

        if (subsets[startRootNode].getLevel() < subsets[endRootNode].getLevel()){
            subsets[endRootNode].setParent(endRootNode);
        } else if (subsets[startRootNode].getLevel() > subsets[endRootNode].getLevel()){
            subsets[endRootNode].setParent(startRootNode);
        } else {
            int newLevel = subsets[startRootNode].getLevel() + 1;
            subsets[endRootNode].setParent(startRootNode);
            subsets[startRootNode].setLevel(newLevel);
        }
    }

    public static @NotNull String resultToText(Edge[] result, int size){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++){
            string.append("Node1: ").append(result[i].getStartNode()).append(" Node2: ").append(result[i].getEndNode()).append(" Weight: ").append(result[i].getWeight()).append("\n");
        }
        return string.toString();
    }

    private static int find(Subset @NotNull [] subsets, int nodeIndex){
        if (subsets[nodeIndex].getParent() != nodeIndex){
            subsets[nodeIndex].setParent(Kruskal.find(subsets, subsets[nodeIndex].getParent()));
        }

        return subsets[nodeIndex].getParent();
    }

}