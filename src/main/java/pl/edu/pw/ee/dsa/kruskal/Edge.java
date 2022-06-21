package pl.edu.pw.ee.dsa.kruskal;

import org.jetbrains.annotations.NotNull;

public class Edge implements Comparable<Edge> {
    private final double weight;
    private final int startNode;
    private final int endNode;

    public Edge(double weight, int startNode, int endNode) {
        this.weight = weight;
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public double getWeight(){
        return weight;
    }

    public int getStartNode(){
        return startNode;
    }

    public int getEndNode(){
        return endNode;
    }

    @Override
    public String toString(){
        return "\nNode1: " + startNode + " Node2: " + endNode + " Weight: " + weight + "";
    }

    @Override
    public int compareTo(@NotNull Edge o) {
        return Double.compare(weight, o.getWeight());
    }
}