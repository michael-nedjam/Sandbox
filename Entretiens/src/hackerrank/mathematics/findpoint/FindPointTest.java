package hackerrank.mathematics.findpoint;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindPointTest {
    @Test
    public void testFindPoint_CASE_1(){
        List<Integer> r = FindPoint.findPoint(0, 0, 1, 1);
        assertTrue(r.get(0) == 2);
        assertTrue(r.get(1) == 2);
    }

    @Test
    public void testFindPoint_CASE_2(){
        List<Integer> r = FindPoint.findPoint(1, 1, 2, 2);
        assertTrue(r.get(0) == 3);
        assertTrue(r.get(1) == 3);
    }
}
