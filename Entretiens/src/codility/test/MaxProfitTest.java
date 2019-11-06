package codility.test;

import codility.MaxProfit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {
    @Test
    public void test_CASE_0(){
        assertEquals(0, MaxProfit.solution(new int[]{4, 3, 2, 0}));
    }

    @Test
    public void test_CASE_1(){
        assertEquals(356, MaxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }
}
