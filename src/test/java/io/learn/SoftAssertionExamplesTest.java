package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExamplesTest {

    @Test
    public void testSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(5, 5, "First Assertion: Values are not equal");
        softAssert.assertEquals(5, 6, "Second Assertion: Values are not equal");

        softAssert.assertTrue("Hello".startsWith("H"), "Third Assertion: String not starting with H");
        softAssert.assertNull(null, "Fourth Assertion: Null is not there");

        softAssert.assertAll();
    }

    @Test
    public void testNormalAssertions() {
        Assert.assertEquals(5, 5, "First Assertion: Values are not equal");
        Assert.assertEquals(5, 6, "Second Assertion: Values are not equal"); // assertion will fail, and the test execution STOPS here

        Assert.assertTrue("Hello".startsWith("H"), "Third Assertion: String not starting with H");
        Assert.assertNull(null, "Fourth Assertion: Null is not there");
    }
}
