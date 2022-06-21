package pl.edu.pw.ee.dsa.kruskal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EdgeTest {
    @Test
    void edge_constructor_pass(){
        //given
        Edge edge = new Edge(5, 1, 2);

        //when

        //then
        Assertions.assertEquals(5, edge.getWeight());
        Assertions.assertEquals(1, edge.getStartNode());
        Assertions.assertEquals(2, edge.getEndNode());
    }

    @Test
    void edge_toString_pass(){
        //given
        Edge edge = new Edge(5 , 1, 2);
        String result = "\nNode1: 1 Node2: 2 Weight: 5.0";

        //when

        //then
        Assertions.assertEquals(result, edge.toString());
    }

    @Test
    void edge_compareTo_pass(){
        //given
        Edge edge1 = new Edge(5 , 1, 2);
        Edge edge2 = new Edge(6 , 3, 4);

        //when
        int result = edge1.compareTo(edge2);

        //then
        Assertions.assertEquals(-1, result);
    }
}
