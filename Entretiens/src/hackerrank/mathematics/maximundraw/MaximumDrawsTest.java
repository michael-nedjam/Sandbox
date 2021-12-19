package hackerrank.mathematics.maximundraw;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaximumDrawsTest {

    /*
     * Complete the 'maximumDraws' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    @Test
    public void test_maximumDraws_maximumDraws_CASE_1() {
        int result = MaximumDraws.maximumDraws(1);
        assertTrue(result == 2);
    }

    @Test
    public void test_maximumDraws_maximumDraws_CASE_2() {
        int result = MaximumDraws.maximumDraws(2);
        assertTrue(result == 3);
    }
}
