package io.learn;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("This method will be executed before each TEST method");
    }

    @Test
    public void testMethod1() {
        System.out.println("This is the actual TEST method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is the actual TEST method2");
        Assert.assertEquals(1 ,2);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("This method will be executed after each TEST method");
    }
}
