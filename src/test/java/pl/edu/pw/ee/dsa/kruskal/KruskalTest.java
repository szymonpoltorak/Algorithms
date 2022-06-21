package pl.edu.pw.ee.dsa.kruskal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class KruskalTest {
    @Test
    void Kruskal_final_string_test_pass(){
        //given
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
        String expected = "Node1: 0 Node2: 1 Weight: 1.0\nNode1: 1 Node2: 3 Weight: 1.0\n" +
                "Node1: 2 Node2: 4 Weight: 1.0\nNode1: 0 Node2: 2 Weight: 2.0\n" +
                "Node1: 4 Node2: 5 Weight: 3.0\n";
        Subset[] subsets = new Subset[6];

        //when
        Arrays.sort(edges);
        for (int i = 0; i < subsets.length; i++){
            subsets[i] = new Subset();
            subsets[i].setParent(i);
        }

        Kruskal.kruskalAlgorithm(edges, subsets);
        String result = Kruskal.resultToText(edges, 5);

        //then
        Assertions.assertEquals(expected, result);
    }
}
