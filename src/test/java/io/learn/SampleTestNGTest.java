package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNGTest {

    @Test(description = "My first test")
    public void testAddPositive() {
        Assert.assertEquals(Calculator.add(3, 5), 8);
    }

    @Test
    public void testAddNegative() {
        Assert.assertEquals(Calculator.add(3, 4), 8);
    }
}
