package codility.test;

import codility.MaximunSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximunSliceTest {
    private MaximunSlice maximunSlice = new MaximunSlice();

    @Test
    public void test_CASE_demo(){
        assertEquals(5, maximunSlice.solution(new int[]{3,2,-6,4,0}));
    }
}
