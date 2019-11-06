package codility.test;

import codility.MaxDoubleSliceSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDoubleSliceSumTest {
    private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
    @Test
    public void test_CASE_demo(){
        assertEquals(17, maxDoubleSliceSum.solution(new int[]{3,2,6,-1,4,5,-1,2}));
    }
}
