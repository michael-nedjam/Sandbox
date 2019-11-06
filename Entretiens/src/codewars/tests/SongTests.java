package codewars.tests;

import codewars.Dubstep;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SongTests {
    @Test
    public void Test1() {
        Assert.assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}