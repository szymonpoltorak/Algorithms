package pl.edu.pw.ee.dsa.kruskal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubsetTest {
    @Test
    void subset_constructor_pass(){
        //given
        Subset tester = new Subset();
        int parent = -1;
        int level = 0;

        //when

        //then
        Assertions.assertEquals(level,tester.getLevel());
        Assertions.assertEquals(parent, tester.getParent());
    }

    @Test
    void subset_toString_pass(){
        //given
        Subset tester = new Subset();

        //when
        String string = "\nRank: 0 Parent: -1";

        //then
        Assertions.assertEquals(string, tester.toString());
    }

    @Test
    void subset_setParent_pass(){
        //given
        Subset tester = new Subset();
        int newParent = 1;

        //when
        tester.setParent(newParent);

        //then
        Assertions.assertEquals(newParent, tester.getParent());
    }

    @Test
    void subset_setLevel_pass(){
        //given
        Subset tester = new Subset();
        int newLevel = 1;

        //when
        tester.setLevel(newLevel);

        //then
        Assertions.assertEquals(newLevel, tester.getLevel());
    }
}
