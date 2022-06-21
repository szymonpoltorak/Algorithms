package pl.edu.pw.ee.dsa.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DfsTest {
    @Test
    void dfsFinder_test_graph_coherent(){
        //given
        var graph = new Graph(4);
        graph.addNewEdge(0, 1);
        graph.addNewEdge(0, 2);
        graph.addNewEdge(1, 3);
        graph.addNewEdge(1, 0);
        graph.addNewEdge(2, 0);
        graph.addNewEdge(2, 3);
        graph.addNewEdge(3, 1);
        graph.addNewEdge(3, 2);
        var expected = true;

        //then
        var result = Dfs.dfsFinder(graph);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dfsFinder_test_graph_not_coherent(){
        //given
        var graph = new Graph(4);
        var expected = false;

        //then
        var result = Dfs.dfsFinder(graph);

        //then
        Assertions.assertEquals(expected, result);
    }
}
