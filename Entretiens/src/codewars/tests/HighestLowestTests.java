package codewars.tests;

import codewars.HishestLowest;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class HighestLowestTests {
    @Test
    public void test1() {
        Assert.assertEquals("42 -9", HishestLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("12000 12000", HishestLowest.highAndLow("12000"));
    }
}