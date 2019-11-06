package codility.test;

import codility.Peaks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeaksTest {

    private Peaks peak = new Peaks();

    @Test
    public void test_CASE_example(){
        assertEquals(3, peak.solution(new int[]{31,2,3,4,3,4,1,2,3,4,6,2}));
    }

    @Test
    public void test_CASE_minimun(){
        assertEquals(1, peak.solution(new int[]{0,1,0}));
    }

    @Test
    public void test_CASE_not_valid(){
        assertEquals(0, peak.solution(new int[]{0,1}));
        assertEquals(0, peak.solution(new int[]{1,0}));
        assertEquals(0, peak.solution(new int[]{0}));
    }
}
