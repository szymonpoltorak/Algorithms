package pl.edu.pw.ee.dsa.karatsuba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KaratsubaTest {
    @Test
    void countHalf_x0_Exception(){
        //given
        long x = 0;
        long y = 235;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Karatsuba.countHalf(x,y));
    }

    @Test
    void countHalf_y0_Exception(){
        //given
        long x = 235;
        long y = 0;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Karatsuba.countHalf(x,y));
    }

    @Test
    void karatsuba_x_less_10_pass(){
        //given
        long x = 5;
        long y = 58;

        //when
        long result = Karatsuba.karatsuba(x,y);

        //then
        Assertions.assertEquals(290, result);
    }

    @Test
    void karatsubaTest_pass(){
        //given
        long x = 8667;
        long y = 4699;

        //when
        long result = Karatsuba.karatsuba(x,y);

        //then
        Assertions.assertEquals(40726233, result);
    }

    @Test
    void countDivide_pass(){
        //given
        long n = 4;
        long x = 450;

        //when
        long result = Karatsuba.countDivide(x,n);

        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void countPowers_pass(){
        //given
        long n = 4;
        long x = 450;

        //when
        long result = Karatsuba.countPowers(x,n);

        //then
        Assertions.assertEquals(4500000, result);
    }
}
