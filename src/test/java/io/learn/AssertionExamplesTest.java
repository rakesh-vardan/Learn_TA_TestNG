package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExamplesTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(5, 5, "Values are not equal");
    }

    @Test
    public void testNotEquals() {
        Assert.assertNotEquals(3, 5, "Values are equal");
    }

    @Test
    public void testTrue() {
        boolean condition = ( 5 > 3 );
        Assert.assertTrue(condition, "Condition is not TRUE");
    }
}
